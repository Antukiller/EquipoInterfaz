package antukiller.models

class Entrenador(
    val experiencia : Int
): equipoFutbol() {

    fun imprimirExperiencia() {
        println("Tengo $experiencia años de experiencia como entrenador")
    }

    override fun entrenar() {
        println("Soy un entrenador y estoy entrenando con el equipo")
    }
}