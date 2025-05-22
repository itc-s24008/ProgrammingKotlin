package chap50

fun main() {
    val x = 5
    (1..9).forEach {
        println("${x}かける${it}は ${x * it} です。")
    }
}