package chap36

fun main() {
    val p = Person()
    p.greet()
}

class Person2 {
    var name = "名無しさん"
    var age = 0
    fun greet() {
        val name = "ヒロシ"
        val age = 46
        println("${name}です。 ${age}才です。")
    }
}