class Device(private val quackBehaviour: QuackBehaviour) {

    fun mimicSound(){
        quackBehaviour.makeSound()
    }
    fun display(){
        println("I am a device!!")
    }
}