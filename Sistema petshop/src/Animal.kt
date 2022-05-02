package animais.pet

open class Animal(nome: String, raca: String, responsavel: String) {

     protected var nome: String = nome
    private var  raca: String = raca
    private var  responsavel: String = responsavel

    open fun movimentar(){
println("O animal esta se movimentando")
}

    open fun comer(){
println("Animal esta comendo")
    }

    open fun  dormir(){
println("Animal esta dormindo")
    }

}