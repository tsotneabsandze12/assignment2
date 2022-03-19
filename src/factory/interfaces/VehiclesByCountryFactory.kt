package factory.interfaces

interface VehiclesByCountryFactory {
    fun createAircraft() : Aircraft;
    fun createCar() : Car;
}