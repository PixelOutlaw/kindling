package io.pixeloutlaw.kindling

import assertk.assertThat
import assertk.assertions.hasSize
import org.junit.jupiter.api.Test

internal class LoggerTest {
    @Test
    fun `does Logger delegate based on given log level`() {
        // given
        val verboseLogger = TestLogger(Log.Level.VERBOSE)
        val debugLogger = TestLogger(Log.Level.DEBUG)
        val infoLogger = TestLogger(Log.Level.INFO)
        val warningLogger = TestLogger(Log.Level.WARNING)
        val errorLogger = TestLogger(Log.Level.ERROR)
        val assertLogger = TestLogger(Log.Level.ASSERT)

        // when
        Log.Level.values().forEach {
            verboseLogger.log(it)
            debugLogger.log(it)
            infoLogger.log(it)
            warningLogger.log(it)
            errorLogger.log(it)
            assertLogger.log(it)
        }

        // then
        assertThat(verboseLogger.loggedMessages).hasSize(6)
        assertThat(debugLogger.loggedMessages).hasSize(5)
        assertThat(infoLogger.loggedMessages).hasSize(4)
        assertThat(warningLogger.loggedMessages).hasSize(3)
        assertThat(errorLogger.loggedMessages).hasSize(2)
        assertThat(assertLogger.loggedMessages).hasSize(1)
    }
}
