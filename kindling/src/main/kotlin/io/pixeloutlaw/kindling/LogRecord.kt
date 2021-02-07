package io.pixeloutlaw.kindling

/**
 * A single logged message.
 *
 * @property level [Log.Level] for this message
 * @property tag Tag for the message
 * @property message Message to log
 * @property throwable [Throwable] that goes along with the message
 */
data class LogRecord(
    val level: Log.Level,
    val tag: String = "",
    val message: String? = null,
    val throwable: Throwable? = null
)
