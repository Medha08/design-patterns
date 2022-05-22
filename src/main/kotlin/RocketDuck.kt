class RocketDuck(flyBehaviour: FlyBehaviour,quackBehaviour: QuackBehaviour):Duck(flyBehaviour,quackBehaviour) {
    override fun display() {
        println("I am a Tesla Duck")
    }
}