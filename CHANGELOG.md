# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [0.5.1] - TBA
### Added

### Changed

### Deprecated

### Removed

### Fixed

### Security

### Infrastructural

## [0.5.0] - 2021-05-11
### Added
- Add support for Android 11 ([#40](https://github.com/velocidi/velocidi-android-sdk/pull/40).

### Changed
- Stop using Advertising Id in track and match requests ([#39](https://github.com/velocidi/velocidi-android-sdk/pull/39)).

### Removed
- Remove domain models. The `track` API supports sending event as JSONObject or JSON String ([#41](https://github.com/velocidi/velocidi-android-sdk/pull/41)).

## [0.4.1] - 2020-09-11
### Added

### Changed

### Deprecated

### Removed

### Fixed
 - Don't throw exception when ad id is unavailable ([#33](https://github.com/velocidi/velocidi-android-sdk/pull/33).

### Security

### Infrastructural


## [0.4.0] - 2020-07-29
### Added

### Changed
- Change `LineItem`'s `productType` to `category`([#27](https://github.com/velocidi/velocidi-android-sdk/pull/27)).

### Deprecated

### Removed
- Remove `Purchase` and `Refund` events([#28](https://github.com/velocidi/velocidi-android-sdk/pull/28)).

### Fixed

### Security

### Infrastructural


## [0.3.0] - 2020-07-27
### Added
 - Add orderPlace event and remove subscription event([#25](https://github.com/velocidi/velocidi-android-sdk/pull/25)).

### Changed

### Deprecated

### Removed

### Fixed

### Security

### Infrastructural


## [0.2.0] - 2020-07-21
### Added
 - Add documentation website ([#11](https://github.com/velocidi/velocidi-android-sdk/pull/11)).
 - Add appView event and update subscription event ([#23](https://github.com/velocidi/velocidi-android-sdk/pull/23)).

### Changed

### Deprecated

### Removed

### Fixed

### Security

### Infrastructural

## [0.1.0] - 2019-05-31
### Added
 - Basic Track and Match functionality ([#3](https://github.com/velocidi/velocidi-android-sdk/pull/3)).
 - Domain models for tracking events ([#4](https://github.com/velocidi/velocidi-android-sdk/pull/4)).

### Changed

### Deprecated
- Deprecated Volley in favor of OkHttp ([#7](https://github.com/velocidi/velocidi-android-sdk/pull/7)).

### Removed

### Fixed

### Security

### Infrastructural
