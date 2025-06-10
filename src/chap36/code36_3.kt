package chap36

fun main() {
    val p = Person()
    p.setNameAndAge("タケシ", 5)
    p.greet()
}

class Person {
    var name = ""
    var age = 0

    fun setNameAndAge(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun greet() {
        println("${name}です。 ${age}才です。")
    }

    fun hoge() {
        val under20 = age < 20
        println(under20)
        if (under20) {
            println("20才未満です")
        }
    }
}