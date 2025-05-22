package chap16

fun main() {
    val a: IntArray = intArrayOf(1000, 1200, 1500, 1000, 2400)
    for (i in (0..6)) {
        println("${i + 1}年目の時給は、${a[i]}円です。")

    }
}