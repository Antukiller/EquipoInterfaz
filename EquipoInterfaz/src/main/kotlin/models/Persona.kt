package antukiller.models

 abstract class Persona(
     val nombre: String,
     val apellido: String,
     val edad: Int,
) {
   abstract fun entrenar()

}