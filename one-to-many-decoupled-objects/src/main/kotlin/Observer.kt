// is registered to Subject to listen to updates
interface Observer{
    fun update( temperature:Float, humidity:Float, pressure:Float)
}
