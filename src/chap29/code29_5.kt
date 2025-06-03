package chap29

import chap27.Ferrari
import chap28.Prius

fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    driveByFerrari(car1)
    driveByPrius(car2)
}

fun driveByCar2(car: Car) {
    car.drive(100.0)
}