package animais.pet

class Cachorro(nome: String, raca: String, responsavel: String) : Animal(nome, raca, responsavel) {
override fun movimentar(){
    println("${this.nome }Andando em 4 patas")
}

    override fun comer() {
        println("${this.nome} Comendo bife")
    }

    override fun dormir() {
        println(" ${this.nome} Dormindo na cama da Jéssica")
    }



}