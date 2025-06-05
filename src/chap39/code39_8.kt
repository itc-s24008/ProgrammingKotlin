package chap39

import kotlin.random.Random

fun main() {
    randomNumberCalculate(6) {
        it * 2
    }
}

fun randomNuberCalculate(max: Int, calculator: (Int) -> Int) {
    val targetNumber = Random.nextInt(max)
    val result = calculator(targetNumber)
    println("計算結果: $result")
}