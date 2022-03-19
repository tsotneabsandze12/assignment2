package factory.models
import factory.interfaces.Aircraft

class Sturzkampfflugzeug  : Aircraft {
    override fun fly() {
        println("Dive Stuka!");
    }
}