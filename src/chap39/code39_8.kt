package chap39

import kotlin.random.Random

fun main() {

}

fun randomNuberCalculate(max: Int, calculator: (Int) -> Int) {
    val targetNumber = Random.nextInt(max)
    val result = calculator(targetNumber)
    println("計算結果: $result")
}