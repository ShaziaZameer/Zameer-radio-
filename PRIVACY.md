# Zameer Radio • AI — Privacy Policy
Last updated: 30 September 2026. Applies to the Android introduction build 4.4 (package `com.zameer.radio`).
Developer: Zameer Ahmad.

## हिंदी

Zameer Radio ऑनलाइन रेडियो, फोन से चुने ऑडियो और स्थानीय मूड खोज की सुविधा देता है। इस संस्करण में ऐप खाता, डेवलपर द्वारा चलाया गया backend, विज्ञापन SDK, भुगतान, सक्रिय सदस्यता या उपयोग-विश्लेषण का server upload नहीं है।

### फोन पर रखा डेटा
पसंदीदा स्टेशन, हाल में सुने स्टेशन, स्थानीय रूप से जोड़े स्टेशन, भाषा/डिज़ाइन, चुनी फोटो, मूड मिक्स, स्टेशन संग्रह और होम शॉर्टकट फोन पर रहते हैं। ऐप Android का automatic app-data backup बंद रखता है। ऐप के निजी डेटा साफ करने, Android app storage साफ करने या uninstall करने से स्थानीय रिकॉर्ड हटाए जा सकते हैं; इससे फोन की मूल ऑडियो फ़ाइलें नहीं मिटतीं।

सुनने और ऐप के foreground उपयोग का सारांश फोन पर अधिकतम 90 दिन रखा जाता है। रिकॉर्डिंग बंद करना और पहले का सारांश मिटाना अलग विकल्प हैं। “सारांश साफ करें” या “ऐप का निजी डेटा साफ करें” से पुराने रिकॉर्ड मिटाएँ। ऐप के अचानक बंद होने पर अंतिम छोटा समय-अंतराल सहेजा न जा सके।

### इंटरनेट और स्टेशन सेवाएँ
Directory खोज के शब्द, भाषा, देश/state और संबंधित filters Radio Browser API को भेजे जाते हैं। प्लेबैक सीधे प्रसारक के stream server से आता है। इन बाहरी सेवाओं को IP address और सामान्य request जानकारी मिल सकती है और उनकी अपनी नीतियाँ लागू होती हैं। ऐप अपनी पसंदीदा सूची, निजी फोटो या स्थानीय ऑडियो इन सेवाओं पर upload नहीं करता।

Near Me में उपयोगकर्ता शहर चुनता है। चुने शहर के centre और उपलब्ध स्टेशन coordinates से आसपास की अनुमानित दूरी निकाली जा सकती है। यह फोन की location नहीं लेता और इस खोज के लिए location permission नहीं माँगता। Manifest में पुरानी coarse-location permission घोषित है, लेकिन वर्तमान city lookup उसे request नहीं करता।

वैकल्पिक online artwork चालू करने पर image hosts से चित्र आते हैं; यह डिफ़ॉल्ट रूप से बंद है। स्टेशन, कार्यक्रम समय, stream और track metadata बाहरी सेवाओं के नियंत्रण में हैं।

### AI और आवाज़
समर्थित आदेश, छोटा उदाहरण-आधारित intent matcher, mood matching और favorites की प्राथमिकता फोन पर काम करते हैं। कोई दूरस्थ सामान्य AI/LLM जुड़ा नहीं है और ऐप अपने आप भावनाएँ नहीं पढ़ता। Voice button दबाने पर microphone permission माँगी जाती है। आवाज़ चुनी Android speech recognition service को दी जाती है; वह online processing कर सकती है। ऐप स्वयं voice recording सहेजकर नहीं रखता। Voice service की अपनी privacy policy लागू होती है।

### आपकी स्पष्ट कार्रवाई पर साझा किया डेटा
- स्थानीय ऑडियो और फोटो Android document/file picker से चुने जाते हैं। ऐप चुनी audio files तक read access रख सकता है; पूरी audio library की स्वतः upload नहीं होती।
- Manual backup में favorites, mood mixes, collections और home shortcuts होते हैं; audio files, फोटो, usage history, login या payment data नहीं। Save/Import पर Android document picker खुलता है। चुना cloud file provider अपनी नीति के अनुसार फ़ाइल sync कर सकता है; ऐप automatic cloud sync सेवा नहीं चलाता। Import favorites/collections को मौजूदा रिकॉर्ड में मिलाता है; shortcuts backup से आ सकते हैं।
- Calendar button कार्यक्रम का event editor खोलता है। उपयोगकर्ता समय और notification जाँचकर Save करता है। ऐप calendar read/write permission नहीं माँगता; calendar app की sync और notification व्यवस्था लागू होती है।
- Share station से स्टेशन का नाम और सार्वजनिक stream URL Android share chooser में जाता है। उपयोगकर्ता प्राप्तकर्ता/app चुनकर भेजना पूरा करता है।
- स्टेशन को केवल फोन पर जोड़ना और Radio Browser की सार्वजनिक directory में भेजना अलग कार्य हैं। सार्वजनिक submission में दर्ज स्टेशन नाम, stream URL, website, country/state, language और tags भेजे जाते हैं। ऐप में इसके लिए मालिक/अधिकृत प्रतिनिधि की स्पष्ट सहमति माँगी जाती है। स्थानीय स्टेशन हटाने से सार्वजनिक directory की entry नहीं मिटती।

### अनुमतियाँ, बच्चे और संपर्क
Internet/network access, foreground media playback, wake lock और audio settings की अनुमतियाँ streaming/background playback के लिए हैं। Microphone केवल voice input के लिए है। यह सामान्य radio app है, खास तौर पर बच्चों के लिए नहीं बनाया गया; प्रसारकों की सामग्री अलग-अलग उम्र के लिए हो सकती है। ऐप सुविधाएँ या data practices बदलें तो नीति भी अपडेट होगी।

निजता के प्रश्न या सहायता के लिए [Zameer Radio repository में issue खोलें](https://github.com/ShaziaZameer/Zameer-radio-/issues)। सार्वजनिक issue में passwords, निजी दस्तावेज़ या sensitive personal information न डालें।

## English

### Scope and local information
Zameer Radio offers online radio, user-selected local audio and on-device mood discovery. Build 4.4 has no app account, developer-operated backend, advertising SDK, payment collection, active subscription or server upload of usage analytics.

Favorites, recent stations, locally added stations, preferences, language/design settings, a selected photo, mood mixes, ordered station collections and home shortcuts remain on the device. Android automatic app-data backup is disabled. Clear app private data, clear Android app storage, or uninstall to remove local app records. Original audio files on your phone are not deleted by clearing app-private data.

Listening and foreground-app usage summaries remain on the device for up to 90 days. Disabling recording does not erase prior summaries; deletion is a separate Summary/Clear app private data action. Abrupt termination may lose the last short unsaved interval.

### External connections
Directory query terms, language, country/state and relevant filters are sent to Radio Browser API servers. Streams connect directly to broadcasters. These independent services can receive ordinary connection information, including IP addresses and request details, under their own policies. The app does not upload your favorites list, private photo or local audio files to them.

Near Me uses a selected city and may compare its centre with available station coordinates to show approximate nearby distances. It does not use your phone's location. A legacy coarse-location permission remains in the manifest, but current city lookup does not request it.

Optional online artwork connects to station image hosts and is off by default. Broadcasters and directory services control station availability, schedules, streams and track metadata.

### AI and microphone
Supported command interpretation, a small example-based intent matcher, mood matching and favorites prioritization run locally. No remote general-purpose AI/LLM is connected and the app does not automatically detect emotions. Microphone permission is requested for the voice-input action. Audio goes to your selected Android speech recognition service, which may process it online under its own policy. This app does not save voice recordings.

### User-directed export and sharing
Android's picker grants access to the photo/audio documents you select; selected audio access may be retained so those files can be played again.

Manual backup export/import contains favorites, mixes, collections and shortcuts, excluding audio, photos, usage logs, login data and payment data. A cloud document provider you choose may sync the file under its own policy. This app does not operate automatic cloud sync. Import merges favorites/collections within capacity limits and may replace shortcut preferences.

Calendar actions open an event editor containing the selected programme details. You review the time and notification and save the event in the Calendar app. Zameer Radio does not request calendar read/write permission. Calendar delivery and account sync belong to that service.

Station sharing passes the station name and public stream URL to Android's share chooser. You select the destination and complete sending.

Adding a station locally is separate from submitting it to Radio Browser's public directory. Explicit public submission sends the entered name, stream/website URLs, country/state, language and tags and requires the station owner's or authorized representative's consent in the app. Deleting a local entry does not remove a public directory entry.

### Permissions, children and changes
Internet/network, foreground media playback, wake lock and audio-settings permissions support playback. Microphone access supports optional voice input. This is a general radio directory, not an app designed specifically for children. Third-party stations may carry content intended for different audiences.

We update this policy when features or data practices change. For privacy questions or support, [open an issue in the Zameer Radio repository](https://github.com/ShaziaZameer/Zameer-radio-/issues). Do not put credentials, private documents or sensitive personal information into a public issue.

