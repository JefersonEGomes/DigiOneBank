package one.digitalinnovation.digionebank


class Pessoa {
    var nome:String = "Jeferson"
    var cpf:String = "123.456.789-00"
    // private set (torna as mudanças do código restrita ao escopo)
    /*inner class Endereco {
        var rua:String ="Rua Imaginária"
    }*/

    constructor()
    fun pessoaInfo() = "Olá $nome de cpf: $cpf, em que posso ajudar ?"
}

fun main() {
    val jeferson = Pessoa()

    println(jeferson.pessoaInfo())
    // println(jeferson.Endereco().rua)
}