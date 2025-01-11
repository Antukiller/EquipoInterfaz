package antukiller.models

class jugadorCentrocampista(dorsal : Int): Jugador(dorsal), distribuir {
    override fun pasar() {
        println("Está pasando el balón")
    }

    override fun entrenar() {
        println("Esta entrenando como centrocampista")
    }

    override fun jugar() {
        println("Esta jugando de centrocampista")
    }
}