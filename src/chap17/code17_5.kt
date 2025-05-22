package chap17

fun main() {
    val a: MutableList<String> = mutableListOf("こんにちは", "Kotorin")
    for ((i, x) in a.withIndex()) {
        println("$i : $x")
    }
    println("-----")
    a.add("どうぞ")
    a.add("お願いします")
    for ((i, x) in a.withIndex()) {
        println("$i : $x")
    }
}