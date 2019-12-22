## Screenshots
<p align="middle">
  <img src="https://raw.githubusercontent.com/duonghominhhuy/kotlin-multi-language/master/Screenshots/Screenshot_1.png" width="200" />
  <img src="https://raw.githubusercontent.com/duonghominhhuy/kotlin-multi-language/master/Screenshots/Screenshot_2.png" width="200" /> 
  <img src="https://raw.githubusercontent.com/duonghominhhuy/kotlin-multi-language/master/Screenshots/Screenshot_3.png" width="200" />
  <img src="https://raw.githubusercontent.com/duonghominhhuy/kotlin-multi-language/master/Screenshots/Screenshot_4.png" width="200" />
</p>

## Features

- Kotlin programming language support.
- Changing application language programmatically.

## Requirements

- Mininum API level: 16.
- Android Studio 3.5.3 or above.

## Code

```kotlin
val languageCode = "en"
val config = resources.configuration
val locale = Locale(languageCode)

Locale.setDefault(locale)
config.locale = locale
resources.updateConfiguration(config, resources.displayMetrics)

recreate()
```

## Find me on:

- Twitter [@duonghominhhuy](https://twitter.com/duonghominhhuy)

## License

kotlin-multi-language is distributed under the MIT license. See [LICENSE](https://github.com/duonghominhhuy/kotlin-multi-language/blob/master/LICENSE) for details.
