import factory.factories.GermanVehiclesFactory
import factory.factories.UsVehiclesFactory
import factory.interfaces.VehiclesByCountryFactory
import point.Point

fun main(){
    //region point

    val point = Point(2,0);

    println(point)

    println(point == Point(2,0))

    point.rotateSymmetrically();
    println(point);

    println(point.calculateDistance(Point()));

    //endregion

    println();
    println();

    //region factories

    val germanVehicles = GermanVehiclesFactory();
    val usVehicles = UsVehiclesFactory();

    println("german: ");
    testDriveVehiclesFromDifferentCountries(germanVehicles);

    println();

    println("us: ");
    testDriveVehiclesFromDifferentCountries(usVehicles);

    //endregion
}

fun testDriveVehiclesFromDifferentCountries(factory: VehiclesByCountryFactory){

    val plane = factory.createAircraft();
    val car = factory.createCar();

    plane.fly();
    car.drive();

}