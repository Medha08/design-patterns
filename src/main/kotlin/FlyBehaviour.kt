//separated out varying concerns to handle separately
//Encapsulated Fly Behaviour
//Family of Algos
interface FlyBehaviour {
   fun fly()
}

class FlyWithWings: FlyBehaviour{
    override fun fly() {
       println("fly away with wings")
    }

}

class NoFly: FlyBehaviour{
    override fun fly() {
        println("we don't fly")
    }
}

class RocketFly: FlyBehaviour {
    override fun fly() {
        println("I fly like a rocket")
    }
}