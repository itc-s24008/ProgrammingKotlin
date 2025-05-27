package chap25

fun main() {
    val p = Person("たかし", 5)
        p.greet()
    val p2 = Person(name = "ケンタ", age = 8)
    p2.greet()
}
class Person constructor(var name: String = "", var age: Int = 0) {
    fun greet() {
        println("${name}です。 ${age}才です。")
    }
}