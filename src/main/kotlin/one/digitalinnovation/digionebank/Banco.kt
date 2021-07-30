package one.digitalinnovation.digionebank

data class Banco(
    val nome: String,
    val numero: Int
) {
    fun info() = "Somos o $nome de numero : $numero, como podemos mudar seu mundo hoje ?"
}
