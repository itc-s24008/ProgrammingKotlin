package chap25

fun main() {
    Person2("タケシ", 7)
}

class Person2(val name: String, var age: Int) {
    init {
        println("コンストラクタのイニシャライザが呼ばれました。")
        greet()
    }
    fun greet() {
        println("${name}です。${age}才です。")
    }
}
