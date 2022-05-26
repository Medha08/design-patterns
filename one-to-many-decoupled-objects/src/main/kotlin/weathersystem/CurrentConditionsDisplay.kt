package weathersystem

class CurrentConditionsDisplay(private val weatherData: WeatherData): Observer, DisplayElement {
    private var temperature = 0F
    private var humidity = 0F
    private var pressure = 0F

    override fun update() {
        this.temperature = weatherData.temperature
        this.humidity = weatherData.humidity
        this.pressure = weatherData.pressure
    }

    override fun display() {
        println("I am a Current Conditions Display")
        println("Temp: $temperature")
        println("Humidity: $humidity")
        println("Pressure: $pressure")
    }
}