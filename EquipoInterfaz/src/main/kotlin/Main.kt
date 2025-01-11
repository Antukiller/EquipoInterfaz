package antukiller

import antukiller.models.*

fun main() {
    val jugadorPortero = jugadorPortero(dorsal = 1)
    val jugadorDefensas = jugadorDefensa(dorsal = 4)
    val jugadorCentrocampista   = jugadorCentrocampista(dorsal = 8)
    val jugadorDelantero = jugadorDelantero(dorsal = 1)

    println()
    jugadorDelantero.imprimirDorsal()
    jugadorDelantero.jugar()
    jugadorDelantero.entrenar()
    jugadorDelantero.chutar()

    println()
    jugadorCentrocampista.imprimirDorsal()
    jugadorCentrocampista.jugar()
    jugadorCentrocampista.entrenar()
    jugadorCentrocampista.pasar()

    println()
    jugadorDefensas.imprimirDorsal()
    jugadorDefensas.jugar()
    jugadorDefensas.entrenar()
    jugadorDefensas.defender()

    println()
    jugadorPortero.imprimirDorsal()
    jugadorPortero.entrenar()
    jugadorPortero.jugar()
    jugadorPortero.parar()

 if (jugadorPortero is jugadorDelantero) {
     (jugadorPortero as jugadorDelantero).chutar()
 }
}