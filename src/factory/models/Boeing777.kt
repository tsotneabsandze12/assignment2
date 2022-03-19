package factory.models
import factory.interfaces.Aircraft

class Boeing777 : Aircraft {
    override fun fly() {
        println("Fly Boeing777!");
    }

}