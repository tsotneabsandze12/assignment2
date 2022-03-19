package factory.factories
import factory.interfaces.Aircraft
import factory.interfaces.Car
import factory.interfaces.VehiclesByCountryFactory
import factory.models.Porsche911
import factory.models.Sturzkampfflugzeug

class GermanVehiclesFactory : VehiclesByCountryFactory {

    override fun createAircraft(): Aircraft
        = Sturzkampfflugzeug();

    override fun createCar(): Car
        = Porsche911();
}