package chap39

fun main() {
    printResult({ x, y -> x + y })
    printResult() { x, y -> x - y }
    printResult { x, y -> x + y }
}

fun printResult(calculator: (Double, Double) -> Double) {
    val result = calculator(10.0, 2.0)
    println("計算結果: $result")
}