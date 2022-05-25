package weathersystem

class ForecastDisplay: Observer, DisplayElement {
    private var temperature = 0F
    private var humidity = 0F
    private var pressure = 0F
    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
    }

    override fun display() {
        println("I am a Forecast Display")
        println("Temp: $temperature")
        println("Humidity: $humidity")
        println("Pressure: $pressure")
    }
}