import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FchTest {

    var fecha : Fch = Fch(0, 0, 0)

    @BeforeEach
    fun setUp() {
        fecha = Fch(21, 6, 2012)
    }

    @Test
    fun valida() {
        assertTrue(fecha.valida())
    }
}