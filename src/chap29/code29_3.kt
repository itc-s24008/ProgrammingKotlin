package chap29

import chap27.Ferrari
import chap28.Prius

fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    driveByFerrari(car1)
    driveByPrius(car2)
}

fun driveByFerrari(car: Ferrari) {
    println("Ferrari 対応の driveByCar が呼ばれました")
    car.drive(100.0)
}
fun driveByPrius(car: Prius) {
    println("Prius 対応の driveByCar が呼ばれました")
    car.drive(100.0)
}