# kindling

kindling is a Kotlin library for logging with no external dependencies.

It was initially developed for use in my Spigot plugins and libraries.

It is inspired by [log4k by saschpe](https://github.com/saschpe/log4k).

## Installation

Use JCenter to get the library.

```groovy
repositories {
    jcenter()
}

dependencies {
    compileOnly "io.pixeloutlaw:kindling:x.y.z"
}
```

```kotlin
repositories {
    jcenter()
}

dependencies {
    compileOnly("io.pixeloutlaw:kindling:x.y.z")
}
```

## Usage

```kotlin
import io.pixeloutlaw.kindling.Log

// ...
Log.addLogger(object : Logger() {
    override val minimumLogLevel: Log.Level = Log.Level.DEBUG

    override fun print(logRecord: LogRecord) {
        println(logRecord)
    }
})

Log.debug("message here")
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
