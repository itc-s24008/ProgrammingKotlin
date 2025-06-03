package chap33

class Car(val color: String) {
    open fun drive() {
        println("${color}の車が走る！")
    }
}

fun main() {
    val car = Car("赤")
    car.drive()
    println(car.toString())
}