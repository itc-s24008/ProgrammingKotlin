package chap07

fun main() {
    val delicious = true
    val cheap = true
    println("このレストランはおいしい: $delicious")
    println("このレストランは安い: $cheap")
    val letsEat = delicious || cheap
    println("食事する?: $letsEat")
}