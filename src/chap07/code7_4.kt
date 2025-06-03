package chap07

fun main() {
    val delicious = false
    val cheap = true
    println("このレストランはおいしい: $delicious")
    println("このレストランは安い: $cheap")
    val letsEat = delicious && cheap
    println("食事する?: $letsEat")
}