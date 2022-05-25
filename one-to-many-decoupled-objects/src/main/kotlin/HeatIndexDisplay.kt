class HeatIndexDisplay : Observer, DisplayElement {
    var temperature = 0F
    var humidity = 0F
    var pressure = 0F
    var heatIndex = 0F

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
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