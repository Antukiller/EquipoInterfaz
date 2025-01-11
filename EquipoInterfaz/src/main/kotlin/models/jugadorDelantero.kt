package antukiller.models

class jugadorDelantero(dorsal : Int): Jugador(dorsal), marcar {
    override fun chutar() {
        println("Está tirando a puerta")
    }

    override fun entrenar() {
        println("Está entrenando como delantero")
    }

    override fun jugar() {
        println("Esta jugando como delantero")
    }

}