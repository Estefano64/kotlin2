package zoo
fun main() {
    val zoologico = Zoologico()

    zoologico.agregarAnimal(Leon("Simba"))
    zoologico.agregarAnimal(Elefante("Dumbo"))

    zoologico.simularDia()
}
