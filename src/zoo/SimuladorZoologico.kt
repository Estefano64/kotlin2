package zoo
abstract class Animal(val nombre: String) {
    abstract val sonido: String
    abstract fun hacerSonido()
}

interface Alimentable {
    fun alimentar()
}

class Leon(nombre: String) : Animal(nombre), Alimentable {
    override val sonido = "rugido"
    override fun hacerSonido() {
        println("$nombre hace un $sonido")
    }
    override fun alimentar() {
        println("Alimentando a $nombre con carne")
    }
}

class Elefante(nombre: String) : Animal(nombre), Alimentable {
    override val sonido = "barrido"
    override fun hacerSonido() {
        println("$nombre hace un $sonido")
    }
    override fun alimentar() {
        println("Alimentando a $nombre con vegetales")
    }
}

class Zoologico {
    private val animales = mutableListOf<Animal>()

    fun agregarAnimal(animal: Animal) {
        animales.add(animal)
        println("${animal.nombre} ha sido añadido al zoológico")
    }

    fun simularDia() {
        println("Un día en el zoológico:")
        animales.forEach { animal ->
            animal.hacerSonido()
            if (animal is Alimentable) {
                animal.alimentar()
            }
        }
    }
}
