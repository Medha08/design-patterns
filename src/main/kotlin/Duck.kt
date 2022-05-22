abstract class Duck(private val flyBehaviour: FlyBehaviour, private val quackBehaviour: QuackBehaviour) {

    abstract fun display()
    fun performFly(){
        //program to interface not implement
        flyBehaviour.fly()
    }

    fun performQuack(){
        quackBehaviour.makeSound()
    }

}