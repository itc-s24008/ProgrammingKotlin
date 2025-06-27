package exam02

import kotlin.random.Random

class Dice(
    val name: String,
    val maxNumber: Int = 6
) {
    var number: Int = 1
        private set

    fun roll() {
        number = Random.nextInt(1, maxNumber + 1)
        println("$name を振った結果: $number")
    }
}
