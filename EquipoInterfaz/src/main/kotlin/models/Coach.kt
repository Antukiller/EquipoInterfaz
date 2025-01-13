package antukiller.models

class Coach(
    nombre: String,
    apellido: String,
    edad: Int,
): Persona(nombre, apellido, edad), Entrenador {
    override fun entrenar() {
        println("Entrenador esta entrenando ")
    }


    override fun dirigir() {
        println("La funcion del entrenador es dirigir")
    }

    override fun posicion() {
        println("La posicion del entrenador ")
    }


}