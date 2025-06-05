package chap38

fun main() {
    val closure = getCountClosure()
    println("クロージャが返した値 = ${closure()}")
    println("クロージャが返した値 = ${closure()}")
    println("クロージャが返した値 = ${closure()}")
}

    fun getCountClosure(): () -> Int {
        var num = 0
        return fun() = ++num

}