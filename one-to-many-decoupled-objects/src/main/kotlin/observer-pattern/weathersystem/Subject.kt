package weathersystem// One to Many Relationship with Observers
// All Objects made will be loosely coupled and unaware of each other
// state remains/owned with subject and objects only use it
//Only thing `weather-system`.Subject knows about `weather-system`.Observer is that it implements `weather-system`.Observer Interface so has an update function to be used to notify

interface Subject{
    fun registerObserver(observer: Observer)
    fun notifyObservers()
    fun unregisterObserver(observer: Observer)
}