package io.pixeloutlaw.kindling

/**
 * Sends log messages to all registered [Logger]s.
 */
object Log {
    enum class Level {
        VERBOSE,
        DEBUG,
        INFO,
        WARNING,
        ERROR,
        ASSERT
    }

    private val loggers = mutableListOf<Logger>()

    /**
     * Adds a [Logger] to the list of delegated [Logger]s.
     */
    fun addLogger(logger: Logger) {
        loggers.add(logger)
    }

    /**
     * Removes all known [Logger]s.
     */
    fun clearLoggers() {
        loggers.clear()
    }

    /**
     * Log at a [Level.VERBOSE] level.
     */
    fun verbose(message: String, throwable: Throwable? = null, tag: String = "") =
        logAtLevel(Level.VERBOSE, tag, throwable, message)

    /**
     * Log at a [Level.DEBUG] level.
     */
    fun debug(message: String, throwable: Throwable? = null, tag: String = "") =
        logAtLevel(Level.DEBUG, tag, throwable, message)

    /**
     * Log at a [Level.INFO] level.
     */
    fun info(message: String, throwable: Throwable? = null, tag: String = "") =
        logAtLevel(Level.INFO, tag, throwable, message)

    /**
     * Log at a [Level.WARNING] level.
     */
    fun warn(message: String, throwable: Throwable? = null, tag: String = "") =
        logAtLevel(Level.WARNING, tag, throwable, message)

    /**
     * Log at a [Level.ERROR] level.
     */
    fun error(message: String, throwable: Throwable? = null, tag: String = "") =
        logAtLevel(Level.ERROR, tag, throwable, message)

    /**
     * Log at a [Level.ASSERT] level.
     */
    fun assert(message: String, throwable: Throwable? = null, tag: String = "") =
        logAtLevel(Level.ERROR, tag, throwable, message)

    /**
     * Log at a given [Level].
     */
    private fun logAtLevel(level: Level, tag: String = "", throwable: Throwable? = null, message: String? = null) =
        loggers.forEach { it.log(level, tag, message, throwable) }
}
