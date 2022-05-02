package animais.pet

fun main() {
    val bicho: Animal = Animal("nina", "Indefinida", "Ninguem")
    bicho.movimentar()

    val cachorro: Cachorro = Cachorro("Luna", "Vira lata", "Gabriela")
cachorro.movimentar()
cachorro.dormir()
cachorro.comer()

    val gato: Animal = Gato("mia", "indefinida", "luiza")
    gato.comer()
    gato.dormir()
    gato.movimentar()
}
