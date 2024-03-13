/**
 * Fecha
 *
 * @property dia
 * @property mes
 * @property anio
 * @constructor Crea una fecha
 */
class Fecha(private val dia: Int, private val mes: Int, private val anio: Int) {


    /**
     * Valida la fecha introducida a la clase.
     *
     * @return
     */
    fun valida(): Boolean {
        return validarRango() && diasDelMes()
    }

    /**
     * Valida el dia en funcion al mes
     *
     * @return
     */
    private fun diasDelMes(): Boolean {
        var diasMes = 0
        when (mes) {
            1, 3, 5, 7, 8, 10, 12 -> diasMes = 31
            4, 6, 9, 11 -> diasMes = 30
            2 -> diasMes = diasFebrero()
        }
        return if (dia > diasMes) false else true
    }

    /**
     * Comprueba si el año es bisiesto
     *
     * @return
     */
    private fun esBisiesto() : Boolean {
        return anio % 400 == 0 || anio % 4 == 0 && anio % 100 != 0
    }

    /**
     * Devuelve la cantidad de dias que tiene febrero en relacion al año
     *
     * @return
     */
    private fun diasFebrero() : Int {
        var dias = 28
        if (esBisiesto()) {
            dias = 29
        }
        return dias
    }

    /**
     * Valida los dias y el mes si se encuentran dentro del rango
     *
     * @return
     */
    private fun validarRango() : Boolean {
        return dia !in 1..31 || mes !in 1..12
    }
}
