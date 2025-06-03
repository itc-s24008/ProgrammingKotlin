package chap07

fun cond1(): Boolean {
    println("cond1を実行")
    return true
}

fun cond2(): Boolean {
    println("cond2を実行")
    return false
}

fun main() {
    if (cond1() || cond2()) {
        println("どちらかが true")
    } else {
        println("両方 false")
    }

    val a = 0
    a != 0 || cond1()

    if (a != 0) {
        cond1()
    }
}