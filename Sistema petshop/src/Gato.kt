package animais.pet

class Gato(nome: String, raca: String, responsavel: String) :  Animal(nome, raca, responsavel) {
    override fun comer() {
        println("${this.nome}Comendo whiskas sachê")
    }

    override fun movimentar() {
        println("${this.nome} andando")
    }

    override fun dormir() {
        println("${this.nome}Dormindo na caixa")
    }


}