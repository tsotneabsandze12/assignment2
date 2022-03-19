package factory.models
import factory.interfaces.Car

class Porsche911 : Car {
    override fun drive() {
        println("Drive 911!");
    }
}