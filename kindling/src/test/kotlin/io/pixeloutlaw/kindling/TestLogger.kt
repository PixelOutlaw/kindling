package io.pixeloutlaw.kindling

/**
 * Logger implementation used for testing the logic in [Logger].
 */
class TestLogger(override val minimumLogLevel: Log.Level) : Logger() {
    val loggedMessages = mutableListOf<LogRecord>()
    override fun print(logRecord: LogRecord) {
        loggedMessages.add(logRecord)
    }
}
