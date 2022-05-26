package weathersystem

// is registered to `weather-system`.Subject to listen to updates
//pull is termed more correct than push
interface Observer{
    fun update()
}
