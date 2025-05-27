package exam02
import kotlin.random.Random

fun main() {
    val dice6 = Dice("赤いサイコロ", 6)
    val dice10 = Dice("青いサイコロ", 10)

    dice6.roll()
    println("${dice6.name}の出目：${dice6.number}")

    dice10.roll()
    println("${dice10.name}の出目：${dice10.number}")
}

class Dice(val name: String, val maxNumber: Int) {
    var number: Int = 1  // 出目の初期値

    fun roll() {
        number = Random.nextInt(1, maxNumber + 1)  // 1〜maxNumber の乱数
    }
}
