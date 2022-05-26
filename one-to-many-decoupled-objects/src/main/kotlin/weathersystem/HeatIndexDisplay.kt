package weathersystem

class HeatIndexDisplay(private val weatherData: WeatherData) : Observer, DisplayElement {
    var temperature = 0F
    var humidity = 0F
    var pressure = 0F
    var heatIndex = 0F

    override fun update() {
        this.temperature = weatherData.temperature
        this.humidity = weatherData.temperature
        this.pressure = weatherData.temperature
        this.heatIndex = temperature+pressure
    }

    override fun display() {
        println("I am a HeatIndex Display")
        println("Temp: $temperature")
        println("Humidity: $humidity")
        println("Pressure: $pressure")
        println("HeatIndex: $heatIndex")
    }
}