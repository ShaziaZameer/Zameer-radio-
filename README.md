# Zameer Radio for Android

Android Studio project wrapping the bundled Zameer Radio interface. The directory of stations is fetched live from Radio Browser; audio is streamed from third-party stations. INTERNET is the only requested Android permission. Favorites are stored on the device.

## Build
Open this directory in Android Studio with JDK 17 and Android SDK 36. Sync Gradle (AGP 8.13.2, Gradle 8.13 or newer). Test on a physical Android device with mobile data and Wi-Fi. Generate a signed Android App Bundle using Build > Generate Signed Bundle / APK. Keep the upload key private. The application ID `com.zameer.radio` must be confirmed before the first Play upload because it cannot be changed for the listing.

## Release checklist
- Verify station directory fetch and HTTPS audio playback on devices, including pause/resume and network errors. This wrapper does not implement background playback, media notification, or lock-screen controls.
- Create and host a public privacy policy that accurately describes Radio Browser API queries, station stream connections, local favorites, and any further analytics or hosting introduced later.
- Complete Play Console data safety, content rating, target audience, store listing, screenshots, and contact details honestly.
- Upload the signed AAB to internal or closed testing. New personal developer accounts must complete Google's closed-testing requirement before production access.

This project has not been compiled or device tested in this environment, which lacks Android SDK/Gradle. Do not submit it to production without those checks.
