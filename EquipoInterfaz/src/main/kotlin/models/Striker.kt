package antukiller.models

class Striker(
    nombre: String,
    apellido: String,
    edad: Int
): Persona(nombre, apellido, edad), Jugador, Delantero {
    override fun entrenar() {
        println("Estoy entrenando como delantero")
    }

    override fun posicion() {
        println("Mi posicion es delantero")
    }

    override fun chutar() {
        println("Estoy tirando como delantero")
    }

}