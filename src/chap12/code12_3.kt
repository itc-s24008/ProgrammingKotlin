package chap12

import kotlin.random.Random

fun main() {
    val x = Random.nextInt(1, 100)
    when (x) {
        1, 2 -> {
            println("ワンかツー")
            println("正解")
        }
        3 -> {
            println("スリー")
            println("惜しい")
        }
        else -> {
            println("ワンかツーかスリー以外")
            println("さようなら")
        }

    }
}