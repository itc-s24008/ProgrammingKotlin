package chap24

fun main() {
    val p = Person()
    p.age = 30
    p.age = 25
    p.age = 80
    p.age = 10
    p.name = "タケシ"
    println(p.message)
}

class Person {
    var name: String = ""
    var age: Int = 0
    val message: String
        get() {
            return "${name}です。${age}才です。"
        }
}