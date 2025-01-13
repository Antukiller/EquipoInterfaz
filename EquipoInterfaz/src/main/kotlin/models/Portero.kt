package antukiller.models

interface Portero : Rol {
    override fun posicion()
    fun blocar()
}