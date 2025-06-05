package chap39

import kotlin.random.Random

fun main() {
    val randomSuffix = nameString()
    println(randomSuffix("タケシ"))
    println(randomSuffix("タケシ"))
    println(randomSuffix("タケシ"))
    println(randomSuffix("タケシ"))
}

fun nameString(): (String) -> String {
    return {
        val randomNumber = Random.nextInt(100)
        it + randomNumber
    }
}
