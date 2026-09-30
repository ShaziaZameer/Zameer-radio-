# Zameer Radio 4.5 — mood queue fixes

The complete 4.5 build source is in `source-4.5.zip` (checksum: `source-4.5.sha256`). It includes native Android code, bundled web UI, station catalogue, font licences and regression checks. The older loose `app/` directory belongs to the historical initial wrapper; the workflow builds only the extracted 4.5 archive in `source45/`.

Changes: strict mood filtering; matching list/queue counts; separate manual scheduled-programme choices; cyclic Next/Previous; Previous in the expanded player; no stale playback on an empty mood; Rangoli removed from Hindi Kavita; two publisher-documented ambient streams for Calm. No verified continuous Hindi Kavita stream was found, so unrelated music is not substituted.

Local core/native regression checks pass. Browser tests, live stream codec probes, release build and lint run in Actions. A green workflow is required before release; physical-device and actual programme-content checks remain separate. No signing credentials are included.

To build locally: verify the checksum, unzip into an empty directory, then run Gradle 8.13 with JDK 17 and Android SDK 36. Tests: `node tests/mood45-core.cjs`, `node tests/mahfil44-core.cjs`, `node tests/mood-queue45-ui.cjs` (Playwright Chromium required).

Public publication of this source was explicitly authorized by the owner on 30 September 2026. Original code remains copyright Zameer Ahmad; see `COPYRIGHT.txt` inside the source. Third-party licences and broadcaster rights remain unchanged.
