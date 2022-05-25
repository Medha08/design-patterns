//Observer Pattern
//defines one to many dependency btw objects so that when one object changes state, all its dependant objects are notified and updated automatically

fun main(){

    val weatherDataSimulator = WeatherData(mutableListOf())

    val currentConditionsDisplay = CurrentConditionsDisplay()
    val staticsDisplay = StaticsDisplay()
    val forecastDisplay = ForecastDisplay()

    weatherDataSimulator.registerObserver(currentConditionsDisplay)
    weatherDataSimulator.registerObserver(forecastDisplay)

    weatherDataSimulator.setMeasurements(2.3F,23F,34F)

    println("---------------------------------------")

    currentConditionsDisplay.display()
    forecastDisplay.display()
    staticsDisplay.display()

    println("---------------------------------------")

    weatherDataSimulator.unregisterObserver(currentConditionsDisplay)
    weatherDataSimulator.registerObserver(staticsDisplay)

    weatherDataSimulator.setMeasurements(3.4F,45F,33F)


    println("---------------------------------------")

    currentConditionsDisplay.display()
    forecastDisplay.display()
    staticsDisplay.display()

    println("---------------------------------------")

}

