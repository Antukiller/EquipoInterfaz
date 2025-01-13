package antukiller

import antukiller.models.*

fun main() {

    val mediocentro: Centrocampista = Midfielder("Toni", "Kroos", 33,)
    val delantero: Delantero = Striker("Rodrigo", "Goes",23)

    println()
    mediocentro.pasar()
    mediocentro.posicion()

    println()
    delantero.chutar()
    delantero.posicion()

    println()
    if (mediocentro is Entrenador) {
        (mediocentro as Entrenador).dirigir()
    }



}
