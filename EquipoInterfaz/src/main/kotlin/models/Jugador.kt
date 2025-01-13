package antukiller.models

interface Jugador : Rol {
    override fun posicion() {
        println("Mi rol es ser jugador")
    }

}