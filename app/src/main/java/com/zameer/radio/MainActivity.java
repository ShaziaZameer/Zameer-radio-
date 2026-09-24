package com.zameer.radio;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.content.Intent;
import android.webkit.WebChromeClient;
import android.webkit.ValueCallback;
import android.webkit.JavascriptInterface;
import android.os.Handler;
import android.os.Looper;
import android.net.Uri;
import androidx.webkit.WebViewAssetLoader;

public class MainActivity extends Activity {
    private WebView webView;
    private ValueCallback<Uri[]> photoCallback;
    private final Handler timerHandler = new Handler(Looper.getMainLooper());
    private Runnable stopPlayback;
    private WebViewAssetLoader loader;

    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        loader = new WebViewAssetLoader.Builder()
            .addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(this)).build();
        webView = new WebView(this);
        setContentView(webView);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setMixedContentMode(WebSettings.MIXED_CONTENT_NEVER_ALLOW);
        webView.setWebChromeClient(new WebChromeClient() {
            @Override public boolean onShowFileChooser(WebView view, ValueCallback<Uri[]> callback,
                    FileChooserParams params) {
                if (photoCallback != null) photoCallback.onReceiveValue(null);
                photoCallback = callback;
                try { startActivityForResult(params.createIntent(), 101); return true; }
                catch (Exception e) { photoCallback = null; return false; }
            }
        });
        webView.addJavascriptInterface(new Object() {
            @JavascriptInterface public void setTimer(long expiry) {
                runOnUiThread(() -> {
                    if (stopPlayback != null) timerHandler.removeCallbacks(stopPlayback);
                    if (expiry > System.currentTimeMillis()) {
                        stopPlayback = () -> webView.evaluateJavascript("window.stopForSleepTimer && window.stopForSleepTimer()", null);
                        timerHandler.postDelayed(stopPlayback, expiry - System.currentTimeMillis());
                    }
                });
            }
        }, "AndroidTimer");
        webView.setWebViewClient(new WebViewClient() {
            @Override public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                return loader.shouldInterceptRequest(request.getUrl());
            }
            @Override public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Uri uri = request.getUrl();
                if ("appassets.androidplatform.net".equals(uri.getHost())) return false;
                if ("https".equals(uri.getScheme())) {
                    startActivity(new Intent(Intent.ACTION_VIEW, uri));
                }
                return true;
            }
        });
        webView.loadUrl("https://appassets.androidplatform.net/assets/index.html");
    }
    @Override protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 101 && photoCallback != null) {
            photoCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(resultCode, data));
            photoCallback = null;
        }
    }
    @Override public void onBackPressed() {
        if (webView.canGoBack()) webView.goBack(); else super.onBackPressed();
    }
    @Override protected void onDestroy() {
        if (stopPlayback != null) timerHandler.removeCallbacks(stopPlayback);
        if (photoCallback != null) photoCallback.onReceiveValue(null);
        webView.destroy();
        super.onDestroy();
    }
}
