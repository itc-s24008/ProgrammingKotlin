package chap30

open class Car(val color: String) {
    var distance: Double = 0.0

    open fun drive(d: Double) {
        distance += d
        println("$color の車が $d km 走りました。")
    }
}
