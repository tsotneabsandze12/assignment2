package factory.factories
import factory.interfaces.Aircraft
import factory.models.Boeing777
import factory.models.Sturzkampfflugzeug

class AircraftFactory {
    fun create(type: String): Aircraft? {
        return when (type) {
            "Stuka" -> Sturzkampfflugzeug();
            "Boeing777" -> Boeing777();
            else -> null;
        }
    }
}