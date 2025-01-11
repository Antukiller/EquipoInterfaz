package antukiller.models

class jugadorPortero(dorsal : Int): Jugador(dorsal), parar {
    override fun parar() {
        println("Esta parando")
    }

    override fun entrenar() {
        println("Está entrenando como portero")
    }

    override fun jugar() {
        println("Está jugando de portero")
    }
}