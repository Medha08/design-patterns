// One to Many Relationship with Observers
// All Objects made will be loosely coupled and unaware of each other
// state remains/owned with subject and objects only use it

interface Subject{
    fun registerObserver(observer:Observer)
    fun notifyObservers()
    fun unregisterObserver(observer: Observer)
}