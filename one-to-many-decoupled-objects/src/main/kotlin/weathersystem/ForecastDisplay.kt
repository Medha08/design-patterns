package weathersystem

class ForecastDisplay(private val weatherData: WeatherData): Observer, DisplayElement {
    private var temperature = 0F
    private var humidity = 0F

    override fun update() {
        this.temperature = weatherData.temperature
        this.humidity = weatherData.humidity
    }

    override fun display() {
        println("I am a Forecast Display")
        println("Temp: $temperature")
        println("Humidity: $humidity")
    }
}