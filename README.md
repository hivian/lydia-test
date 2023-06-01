<h1 align="center">Android-Compose-MVVM</h1>

<p align="center">
  <a href="https://developer.android.com/jetpack/compose">
    <img src="https://img.shields.io/badge/compose-1.4.3-brightgreen" alt="Compose Version">
  </a>
  <a href="https://kotlinlang.org/docs/whatsnew18.html">
    <img src="https://img.shields.io/badge/kotlin-1.8.10-blue" alt="Kotlin Version">
  </a>
  <a href="https://docs.gradle.org/8.0.2/release-notes.html">
    <img src="https://img.shields.io/badge/gradle-8.0.2-blue" alt="Gradle">
  </a>
  <a href="https://android-arsenal.com/api?level=27">
    <img src="https://img.shields.io/badge/API-27%2B-blue" alt="API">
  </a>
  <a href="https://github.com/hivian/Android-Compose-MVVM/blob/master/LICENSE">
    <img src="https://img.shields.io/badge/License-MIT-green" alt="License">
  </a>
</p>

<p align="center">
  A simple demo app built with Kotlin, using Jetpack Compose, based on clean architecture and MVVM pattern. <br/>
  Data fetched from https://randomuser.me api and saved to Android database
</p>

## Preview
<p>
  <img src="preview1.gif" width="270"/>
  <img src="preview2.gif" width="270"/>
</p>

## Features

- [x] Offline mode
- [x] Pagination: infinite scroll
- [x] Specific error messages with retry action
- [x] Dark mode

## Tech stack

* [Compose](https://developer.android.com/jetpack/compose) - Declarative and simplified way for UI development
* [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) - Dependency injection
* [Navigation](https://developer.android.com/topic/libraries/architecture/navigation) - Screen routing handler
* [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - UI related data holder, lifecycle aware
* [Room](https://developer.android.com/topic/libraries/architecture/room) - Local database
* [Retrofit](https://square.github.io/retrofit/) - Networking client
* [Coroutines](https://developer.android.com/topic/libraries/architecture/coroutines) - Concurrency design pattern for asynchronous programming

## Architecture

* SOLID principles
* MVVM clean architecture

## Package Structures

```
com.hivian.compose_mvvm       # Root Package
├── core                      # Common base components
│   ├── di                    # Dependency injection module
│   ├── data                  # Data wrappers
|   │   ├── network           # Http result wrappers
|   |   └── paginator         # Default pager
│   ├── extensions            # Kotlin extensions
|   └── services              # Base services with interfaces
|       ├── localization      # Internationalization
|       └── userinteraction   # Pop-up messages
|
├── data                      # Data layer
│   ├── di                    # Dependency injection module
│   ├── models                # Entities & DTO Models
│   └── sources               # Data sources
|       ├── local             # Local database client
|       │   ├── converters    # Complex data serializer
|       |   └── dao           # Data Access Object for Room
|       └── remote            # Remote data client
│
├── domain                    # Domain layer
│   ├── di                    # Dependency injection module
│   ├── mappers               # DTO to domain models mapper
│   ├── models                # Domain models
|   └── services              # Services with interfaces
|       ├── randomusers       # Fetch random users data
|       ├── database          # Interact with database
|       └── networking        # Interact with network
|
├── presentation              # Presentation layer
│   ├── di                    # Dependency injection module
│   ├── detail                # Detail screen viewModel
│   └── home                  # Main screen viewModel
|
├── ui                        # User Interface layer
│   ├── di                    # Dependency injection module
│   ├── composables           # Composables functions for building UI
│   ├── services              # Services with interfaces
|   │   └── navigation        # Navigation controller
│   └── themes                # Design system
|
└── App                       # Application entry point

```


## Download

Go to the [releases page](https://github.com/hivian/Android-Compose-MVVM/releases) to download the latest available apk.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
