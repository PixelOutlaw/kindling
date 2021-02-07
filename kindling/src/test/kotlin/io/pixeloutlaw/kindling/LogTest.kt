package io.pixeloutlaw.kindling

import assertk.assertThat
import assertk.assertions.hasSize
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class LogTest {
    @BeforeEach
    fun setup() {
        Log.clearLoggers()
    }

    @Test
    fun `does Log distribute logs to all registered Loggers`() {
        // given
        val verboseLogger = TestLogger(Log.Level.VERBOSE)
        val assertLogger = TestLogger(Log.Level.ASSERT)
        Log.addLogger(verboseLogger)
        Log.addLogger(assertLogger)

        // when
        Log.debug("")
        Log.assert("")

        // then
        assertThat(verboseLogger.loggedMessages).hasSize(2)
        assertThat(assertLogger.loggedMessages).hasSize(1)
    }
}
