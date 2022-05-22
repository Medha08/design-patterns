class MallordDuck: Duck(FlyWithWings(),QuackSound()) {
    override fun display() {
        println("I am a Mallord Ducky")
    }
}