package antukiller.models

class Goalkeeper(
    nombre: String,
    apellido: String,
    edad: Int,
): Persona(nombre, apellido, edad), Portero, Jugador{
    override fun entrenar() {
        println("Estoy entrenando como portero")
    }

    override fun posicion() {
        println("Mi posicicion es portero")
    }

    override fun blocar() {
        println("Estoy blocando como portero")
    }


}