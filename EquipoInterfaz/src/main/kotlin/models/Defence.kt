package antukiller.models

class Defence(
    nombre: String,
    apellido: String,
    edad: Int,
): Persona(nombre ,apellido, edad), Defensa, Jugador {
    override fun entrenar() {
        println("Estoy entrenando como defensa")
    }

    override fun posicion() {
        println("Mi posicion es defensa")
    }

    override fun defender() {
        println("Estoy defendiendo como defensa")
    }

}