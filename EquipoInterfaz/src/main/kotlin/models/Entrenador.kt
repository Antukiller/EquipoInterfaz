package antukiller.models

import java.time.LocalDate

class Entrenador(
    val experiencia : Int
): equipoFutbol() {

    override fun entrenar() {
        println("Soy un entrenador y estoy entrenando con el equipo...")
    }
}