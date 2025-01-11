package antukiller

import antukiller.models.*

fun main() {
    val entrenador = Entrenador(experiencia = 8)
    val portero = jugadorPortero(dorsal = 1)
    val defensa = jugadorDefensa(dorsal = 4)
    val centrocampista = jugadorCentrocampista(dorsal = 8)
    val delantero = jugadorDelantero(dorsal = 9)

    entrenador.experiencia
    entrenador.entrenar()
    entrenador.imprimirExperiencia()

    println()
    delantero.imprimirDorsal()
    delantero.jugar()
    delantero.entrenar()
    delantero.chutar()

    println()
    centrocampista.imprimirDorsal()
    centrocampista.jugar()
    centrocampista.entrenar()
    centrocampista.pasar()

    println()
    defensa.imprimirDorsal()
    defensa.jugar()
    defensa.entrenar()
    defensa.defender()

    println()
    portero.imprimirDorsal()
    portero.entrenar()
    portero.jugar()
    portero.parar()

}