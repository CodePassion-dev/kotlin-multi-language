## Screenshots
<p float="left">
  <img src="https://raw.githubusercontent.com/duonghominhhuy/kotlin-multi-language/master/Screenshots/Screenshot_1.png" width="100" />
  <img src="https://raw.githubusercontent.com/duonghominhhuy/kotlin-multi-language/master/Screenshots/Screenshot_2.png" width="100" /> 
  <img src="https://raw.githubusercontent.com/duonghominhhuy/kotlin-multi-language/master/Screenshots/Screenshot_3.png" width="100" />
  <img src="https://raw.githubusercontent.com/duonghominhhuy/kotlin-multi-language/master/Screenshots/Screenshot_4.png" width="100" />
</p>

## Features

- Kotlin programming language support.
- Changing application language programmatically.

## Change app language

```kotlin
val languageCode = "en"
val config = resources.configuration
val locale = Locale(languageCode)

Locale.setDefault(locale)
config.locale = locale
resources.updateConfiguration(config, resources.displayMetrics)

recreate()
```

## Requirements

Android Studio 3.5.3 or above.
Mininum API level: 16.

## Find me on:

- Twitter [@duonghominhhuy](https://twitter.com/duonghominhhuy)

## License

kotlin-multi-language is distributed under the MIT license. See [LICENSE](https://github.com/duonghominhhuy/kotlin-multi-language/blob/master/LICENSE) for details.
