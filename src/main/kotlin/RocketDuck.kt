class RocketDuck:Duck(RocketFly(),NoSound()) {
    override fun display() {
        println("I am a Tesla Duck")
    }
}