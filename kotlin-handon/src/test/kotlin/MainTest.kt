import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName

internal class MainTest {
    lateinit var main: Main

    @BeforeEach
    fun init() {
        main = Main()
    }

    @Test
    @DisplayName("引数に渡した値をそのまま返す")
    fun returnString() {
        assertEquals("hoge", main.returnString("huga"))
    }

    @Test
    @DisplayName("引数に渡した値をそのまま返す2")
    fun returnString2() {
        assertEquals("hoge", main.returnString("huga"))
    }
}