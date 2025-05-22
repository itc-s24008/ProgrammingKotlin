package chap50

fun main() {
    val a = listOf("こんにちは", "Kotolin", "どうぞ", "よろしく")

    println("forEach 使う方法１")
    a.forEach { println(it) }

    println("forEach 使う方法２")
    a.forEach(::println)
}