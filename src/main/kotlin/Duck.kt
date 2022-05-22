//Composition over Inheritance [Has-A, FlyBheaviour,QuackBehaviour]
abstract class Duck(private var flyBehaviour: FlyBehaviour, private val quackBehaviour: QuackBehaviour) {
    abstract fun display()
    fun performFly(){
        //program to interface not implement
        flyBehaviour.fly()
    }

    fun performQuack(){
        quackBehaviour.makeSound()
    }

    //dynamically set behaviour during runtime
    fun setFlyBehaviour(flyBehaviourRunTime: FlyBehaviour){
        flyBehaviour = flyBehaviourRunTime
    }

}