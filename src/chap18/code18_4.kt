package chap18

import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.system.measureTimeMillis

fun main() {
    val targetSet = mutableSetOf<Int>()
    for (x in 1..10000) {
        targetSet += Random.nextInt(0..100_000_000)
    }
    val targetList = targetSet.toMutableList()

    val listTime = measureTimeMillis {
        for (x in 0..100_000_0) {
            targetList.contains(x)
        }
    }
    println("MutableList の検索時間: $listTime ミリ秒")

    val setTime = measureTimeMillis {
        for (x in 0..100_000_0) {
            targetSet.contains(x)
        }
    }
    println("MutableSet の検索時間: $setTime ミリ秒")
}