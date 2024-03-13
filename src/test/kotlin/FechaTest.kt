import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FechaTest {

    var fecha : Fecha = Fecha(0, 0, 0)

    @BeforeEach
    fun setUp() {
        fecha = Fecha(21, 6, 2012)
    }

    @Test
    fun valida() {
        assertTrue(fecha.valida())
    }
}