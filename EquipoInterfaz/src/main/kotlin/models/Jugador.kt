package antukiller.models

abstract class Jugador(
    val dorsal : Int,
): equipoFutbol() {

    fun imprimirDorsal(){
        println("El dorsal es: $dorsal")
    }

    abstract fun jugar()

    override fun entrenar() {
        println("Soy un jugador y estoy entrenando con mi equipo")
    }

}