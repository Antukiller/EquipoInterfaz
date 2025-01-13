package antukiller.models

class Midfielder(
    nombre: String,
    apellido: String,
    edad: Int,
): Persona(nombre, apellido, edad),Centrocampista, Jugador, Entrenador{
    override fun entrenar() {
        println("Estoy entrnando como centrocampista")
    }

    override fun pasar() {
        println("Estoy pasando el balon al hueco")
    }

    override fun dirigir() {
        println("El mediocentro cumple la funcion jugador-entrenador")
    }

    override fun posicion() {
        println("Mi posicion es centrocampista")
    }

}
