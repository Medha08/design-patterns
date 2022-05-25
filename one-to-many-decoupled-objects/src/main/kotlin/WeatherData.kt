
class WeatherData(private val listOfObservers:MutableList<Observer>):Subject{
    private var temperature:Float = 0.0f
    private var pressure:Float = 0.0f
    private var humidity:Float = 0.0f

    override fun registerObserver(observer: Observer) {
        listOfObservers.add(observer)
    }

    override fun notifyObservers() {
        listOfObservers.forEach { observer ->
            observer.update(temperature,pressure,humidity)
        }
    }

    override fun unregisterObserver(observer: Observer) {
        listOfObservers.remove(observer)
    }

    private fun measurementsChanged(){
        notifyObservers()
    }

    fun setMeasurements(temperature:Float,pressure:Float,humidity:Float){
        this.temperature = temperature
        this.pressure = pressure
        this.humidity = humidity
        measurementsChanged()
    }


}