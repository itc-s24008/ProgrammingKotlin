package chap40

class Person(val name: String, val age: Int) {
    fun greet() {
        println("${name}です。${age}才です。")
    }

    fun displayName(): String {
        return "名前: $name, 年齢: $age"
    }
}

fun main() {
    val p1 = Person("タケシ", 5)
    val p2 = Person("ケンタ", 5)
    val p3 = Person("ユミ", 8)

    val list = listOf(p1, p2, p3)
    val pMax = list.maxBy(Person::age)!!

    println("最年長なのは誰？")
    pMax.greet()

    val getPersonDisplayName = Person::displayName
    println(getPersonDisplayName(pMax))  // → displayName関数を呼び出し
}
