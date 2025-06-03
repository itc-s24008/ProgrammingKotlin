package chap23

fun main() {
    val p = Parson()
    p.name = "たけし"
    p.age = 5
    p.greet()
}
class Parson {
    var name: String = ""
    var age: Int = 0
    fun greet() {
        println("こんにちは、私の名前は${name}です。年齢は${age}才です。")
    }
}