# Zameer Radio • AI 4.7

The authoritative Android source is `source-4.7.zip`, checked against `source-4.7.sha256` and built by GitHub Actions. Earlier snapshots remain historical.

## Smart Volume

Smart Volume is enabled by default for live radio, with a saved on/off setting in Hindi and English. It slowly raises quiet programmes by at most 6 dB, lowers loud programmes, and uses a stereo-linked look-ahead peak limiter. A low-level gate avoids boosting near-silence. Recorded poetry and local audio bypass levelling. Unsupported PCM formats also bypass it, with a visible status. Turning it off preserves the original decoded PCM bytes.

This is conservative RMS levelling, not a broadcast LUFS normalizer. It cannot repair a distorted source or make extremely quiet stations exactly as loud as every other station. Gain changes affect dynamics intentionally; there is no resampling, codec conversion, bitrate reduction or change to the existing Smart Sound tone profiles. Its internal audio buffer holds at most about 20 ms.

## Startup

The initial live-radio audio cushion falls from 2.5 to 1.5 seconds. Actual startup still depends on the station server, connection and stream format. The forward buffer and 8–20 second adaptive stall-recovery cushion remain in place. Recordings and local audio keep their existing startup behavior. All 4.6 mood, navigation, recorded-poetry and saved-volume improvements are retained.

## Verification

Locally passed: 54 synthetic-audio checks covering bounded gain, peak protection, unchanged silence, stereo balance, arbitrary decoder chunks, duration preservation and exact disabled bypass. Startup, buffering, network handover, tone profile and mood/recording regression checks are included.

The workflow additionally runs the real Media3 processor lifecycle unit tests, Chromium UI checks, Android release builds and lint. Consult the workflow result for their status. Physical-device listening and real-station startup measurements are still required before judging perceived sound quality or publishing this release.

Signing is private using the existing upload key. No signing credentials are in this repository.
