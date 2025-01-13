package antukiller.models

interface Defensa : Rol {
    override fun posicion() {
        println("El rol del jugador es ser defensa")
    }

    fun defender() {
        println("El defensa ha cortado la jugada")
    }
}