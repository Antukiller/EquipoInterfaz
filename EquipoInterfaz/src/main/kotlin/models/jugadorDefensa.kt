package antukiller.models

class jugadorDefensa(dorsal : Int): Jugador(dorsal), defensa {
    override fun defender() {
        println("Está defendiendo")
    }

    override fun entrenar() {
        println("Estoy entrenando como defensa")
    }

    override fun jugar() {
        println("Esta jugando de defensa")
    }
}