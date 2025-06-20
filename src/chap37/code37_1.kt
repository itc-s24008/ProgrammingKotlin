package chap37

import kotlin.random.Random

fun main() {
    val p = ::calculatePlus
    val m = ::calculateMinus
    println(p(2.0, 3.0))
    println(m(2.0, 3.0))

    printRandomValuesCalculation(p)
    printRandomValuesCalculation(m)
}

fun calculatePlus(x: Double, y: Double): Double = x + y
fun calculateMinus(x: Double, y: Double): Double = x - y

fun printRandomValuesCalculation(calculator: (Double, Double) -> Double) {
    val x = Random.nextDouble()
    val y = Random.nextDouble()
    val result = calculator(x, y)
    println("計算結果は${result}です。")
}
