package chap15

import kotlin.random.Random

fun main() {
    while (true) {
        val value = Random.nextInt(100)
        println("乱数: $value")
        if (value < 10) {
            break
        }
    }
}