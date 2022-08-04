import org.junit.Test


class SingletonTest{

    @Test
    fun `only one instance of Singleton is created and  is accessible globally`(){
        var a = Singleton
        a.sampleVariable = "Testing"
        assert(a.sampleVariable.contentEquals("Testing"))
    }

}