interface QuackBehaviour {
    fun makeSound()
}

class QuackSound:QuackBehaviour{
    override fun makeSound() {
        println("quack quack")
    }
}

class NoSound:QuackBehaviour{
    override fun makeSound() {
        println("we don't make sound")
    }
}

class SqueakSound:QuackBehaviour{
    override fun makeSound() {
        println("squeak squeak")
    }
}