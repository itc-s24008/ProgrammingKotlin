package chap40

class Person2(val name: String, val age: Int) {
    fun greet() {
        println("${name}です。${age}才です。")
        at18year(::moreYearsAt)
    }

    fun greet2() {
        println("${name}です。${age}才です。")
        at18year(this::moreYearsAt)  // または `::moreYearsAt` でも動作する
    }

    fun moreYearsAt(year: Int): Int {
        return year - age
    }
}

fun at18year(action: (Int) -> Int) {
    println("18歳まで${action(18)}年です。")
}

fun main() {
    val p1 = Person2("ユミ", 8)
    val p2 = Person2("ケンタ", 5)
    p1.greet()
    p1.greet2()
    p2.greet()
    p2.greet2()
}
