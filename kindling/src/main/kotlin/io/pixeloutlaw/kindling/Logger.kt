package io.pixeloutlaw.kindling

/**
 * Analogous to an appender from Logback or log4j.
 */
abstract class Logger {
    /**
     * Minimum [Log.Level] for this [Logger] implementation.
     */
    protected abstract val minimumLogLevel: Log.Level

    /**
     * Logs the given [message] at the given [level] if the level is allowed.
     */
    fun log(level: Log.Level, tag: String = "", message: String? = null, throwable: Throwable? = null) {
        if (level.ordinal >= minimumLogLevel.ordinal) {
            print(LogRecord(level, tag, message, throwable))
        }
    }

    /**
     * Handles the given [logRecord].
     */
    protected abstract fun print(logRecord: LogRecord)
}
