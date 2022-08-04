object Singleton{
    init{
        println("Hello there I am a Singleton")
    }
    var sampleVariable = "Some Name"
    fun printName(){
        println(sampleVariable)
    }
    var a = SomeClass()
}

class SomeClass {
   init {
       println(Singleton.sampleVariable)
   }

}

fun main(){
    Singleton.printName()
    Singleton.sampleVariable = "Other Name"
    Singleton.printName()
}

