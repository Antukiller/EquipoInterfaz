package antukiller

import antukiller.models.*

fun main() {

    val mediocentro: Centrocampista = Midfielder("Toni", "Kroos", 33)
    val delantero: Delantero = Striker("Rodrigo", "Goes",23)
    val portero: Portero = Goalkeeper("Iker", "Casillas",43)
    val suplente = JugadorSuplente("Jesús", "Vallejo", 27)

    println()
    mediocentro.pasar()
    mediocentro.posicion()

    println()
    delantero.chutar()
    delantero.posicion()

    println()
    portero.blocar()
    portero.posicion()

    println()
    suplente.defender()
    suplente.posicion()

    println()
    if (mediocentro is Entrenador) {
        (mediocentro as Entrenador).dirigir()
    }

    if (delantero is Portero) {
        (delantero as Portero).blocar()
    }

    if (portero is Delantero) {
        (portero as Delantero).chutar()
    }

    if (suplente is Centrocampista) {
        (suplente as Centrocampista).pasar()
    }

    if (suplente is Delantero) {
        (suplente as Delantero).chutar()
    }







}
