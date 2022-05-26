package weathersystem
//Observer Pattern
//defines one to many dependency btw objects so that when one object changes state, all its dependant objects are notified and updated automatically

fun main(){

    val weatherDataSubject = WeatherData(mutableListOf())

    val currentConditionsDisplay = CurrentConditionsDisplay(weatherDataSubject)
    val staticsDisplay = StaticsDisplay(weatherDataSubject)
    val forecastDisplay = ForecastDisplay(weatherDataSubject)
    val heatIndexDisplay = HeatIndexDisplay(weatherDataSubject)

    weatherDataSubject.registerObserver(currentConditionsDisplay)
    weatherDataSubject.registerObserver(forecastDisplay)

    weatherDataSubject.setMeasurements(2.3F,23F,34F)

    println("--------------Current & Forecast are only observers-------------------------")

    currentConditionsDisplay.display()
    forecastDisplay.display()
    staticsDisplay.display()

    println("-----------------Current unregisters while statics registers----------------------")

    weatherDataSubject.unregisterObserver(currentConditionsDisplay)
    weatherDataSubject.registerObserver(staticsDisplay)

    weatherDataSubject.setMeasurements(3.4F,45F,33F)


    println("---------------Forecast & Static are only observers ------------------------")

    currentConditionsDisplay.display()
    forecastDisplay.display()
    staticsDisplay.display()

    println("--------------HeatIndex registers as well -------------------------")

    weatherDataSubject.registerObserver(heatIndexDisplay)
    weatherDataSubject.setMeasurements(20F,10F,4F)

    println("--------------HeatIndex & Forecast & Static are now observers -------------------------")

    currentConditionsDisplay.display()
    forecastDisplay.display()
    staticsDisplay.display()
    heatIndexDisplay.display()
}

