package antukiller.models

import java.time.LocalDate

abstract class Jugador(
    val dorsal : Int,
    val posiscion: posicion
): equipoFutbol() {

    fun imprimirDorsal(){
        println("el dorsal es: $dorsal")
    }

    abstract fun jugar()

    override fun entrenar() {
        println("Soy un jugador y estoy entrenando con mi equipo...")
    }

}