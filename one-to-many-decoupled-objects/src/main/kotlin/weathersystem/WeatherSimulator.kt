package weathersystem//`weather-system`.Observer Pattern
//defines one to many dependency btw objects so that when one object changes state, all its dependant objects are notified and updated automatically

fun main(){

    val weatherDataSimulator = WeatherData(mutableListOf())

    val currentConditionsDisplay = CurrentConditionsDisplay()
    val staticsDisplay = StaticsDisplay()
    val forecastDisplay = ForecastDisplay()
    val heatIndexDisplay = HeatIndexDisplay()

    weatherDataSimulator.registerObserver(currentConditionsDisplay)
    weatherDataSimulator.registerObserver(forecastDisplay)

    weatherDataSimulator.setMeasurements(2.3F,23F,34F)

    println("--------------Current & Forecast are only observers-------------------------")

    currentConditionsDisplay.display()
    forecastDisplay.display()
    staticsDisplay.display()

    println("-----------------Current unregisters while statics registers----------------------")

    weatherDataSimulator.unregisterObserver(currentConditionsDisplay)
    weatherDataSimulator.registerObserver(staticsDisplay)

    weatherDataSimulator.setMeasurements(3.4F,45F,33F)


    println("---------------Forecast & Static are only observers ------------------------")

    currentConditionsDisplay.display()
    forecastDisplay.display()
    staticsDisplay.display()

    println("--------------HeatIndex registers as well -------------------------")

    weatherDataSimulator.registerObserver(heatIndexDisplay)
    weatherDataSimulator.setMeasurements(20F,10F,4F)

    println("--------------HeatIndex & Forecast & Static are now observers -------------------------")

    currentConditionsDisplay.display()
    forecastDisplay.display()
    staticsDisplay.display()
    heatIndexDisplay.display()
}

