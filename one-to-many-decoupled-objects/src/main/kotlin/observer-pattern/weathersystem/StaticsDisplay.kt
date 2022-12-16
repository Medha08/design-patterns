package weathersystem

class StaticsDisplay(val weatherData: WeatherData): Observer, DisplayElement {
    private var temperature = 0F
    private var pressure = 0F

    override fun update() {
        this.temperature = weatherData.temperature
        this.pressure = weatherData.pressure
    }

    override fun display() {
        println("I am a Statics Display")
        println("Temp: $temperature")
        println("Pressure: $pressure")
    }
}