package factory.factories
import factory.interfaces.Aircraft
import factory.interfaces.Car
import factory.interfaces.VehiclesByCountryFactory
import factory.models.Boeing777
import factory.models.Charger69

class UsVehiclesFactory : VehiclesByCountryFactory {

    override fun createAircraft(): Aircraft
        = Boeing777();

    override fun createCar(): Car
        = Charger69();
}