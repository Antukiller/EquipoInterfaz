package antukiller.models

class JugadorSuplente(
    nombre: String,
    apellido: String,
    edad: Int,
): Persona(nombre, apellido, edad), Defensa, Centrocampista, Delantero {
    override fun entrenar() {
        println("El jugador suplente está entrenando")
    }

    override fun posicion() {
        println("El jugador suplente está preparado para cualquier posicion")
    }

    override fun chutar() {
        println("EL jugador suplente puede chutar ")
    }

    override fun pasar() {
        println ("El jugador suplente está capacitado para pasar y distruibuir el esférico")
    }

    override fun defender() {
        println("El jugador suplente puede jugar como defensa ")
    }



}