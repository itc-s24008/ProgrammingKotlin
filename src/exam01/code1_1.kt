package exam01

fun main() {
    val end = readln().toInt()
    (1..end).forEach {
        val result = if (it % 15 == 0) {
            "FizzBuzz"
        } else if (it % 5 == 0) {
            "Buzz"  // ← 修正
        } else if (it % 3 == 0) {
            "Fizz"
        } else {
            it.toString()
        }
        println(result)
    }
}
