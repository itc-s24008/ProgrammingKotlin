package chap31

interface Flyable {
    fun fly()
}

class FlyingVehicle : Flyable {
    override fun fly() {
        println("この乗り物は空を飛びます。")
    }
}

fun main() {
    val vehicle = FlyingVehicle()
    vehicle.fly()
}
