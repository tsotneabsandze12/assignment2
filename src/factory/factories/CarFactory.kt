package factory.factories
import factory.interfaces.Car
import factory.models.Charger69
import factory.models.Porsche911

class CarFactory {
    fun create(type: String): Car? {
        return when (type) {
            "Porsche" -> Porsche911();
            "Charger" -> Charger69();
            else -> null;
        }
    }
}