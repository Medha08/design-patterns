//separated out varying concerns to handle separately
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
