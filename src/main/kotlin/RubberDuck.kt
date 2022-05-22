class RubberDuck(flyBehaviour: FlyBehaviour,quackBehaviour: QuackBehaviour):Duck(flyBehaviour,quackBehaviour ) {
    override fun display() {
        println("I am a Rubber Ducky")
    }
}