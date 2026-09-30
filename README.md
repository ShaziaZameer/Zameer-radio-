# Zameer Radio • AI 4.6

The authoritative Android build source is `source-4.6.zip`, verified with `source-4.6.sha256`. GitHub Actions extracts it into `source46`, runs the checks and builds APK/AAB files. Existing loose files and the 4.5 ZIP are historical snapshots.

Version 4.6 / code 46 retains the strict mood queues, cyclic Next/Previous and distinct calm streams from 4.5, and adds six selected recorded Hindi poems from the publisher’s public **Pratidin Ek Kavita / Nayi Dhara Radio** podcast feed. Audio remains hosted by the publisher. The UI clearly labels recordings, credits poets and the publisher, links the original episodes, and supports Next/Previous and seeking. These recordings never enter live-radio recommendations or station favorites.

Publisher: https://pratidinekkavita.transistor.fm/
Public feed: https://feeds.transistor.fm/pratidin-ek-kavita

No signing credentials are stored in this repository. Release artifacts from Actions are unsigned; signing is performed privately with the existing app upload key.

Tests: core radio/mood checks, native queue checks, recorded-poetry filtering and attribution, Chromium UI navigation/seek/label checks, six official-feed/audio checks, and Android release lint. Physical Android playback still needs device testing.
