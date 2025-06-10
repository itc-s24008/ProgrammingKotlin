package chap44

fun main() {
    val text = "勉強"
    val message = text.getOneTwoFiveMessage()
    println(message)
}

fun String.getOneTwoFiveMessage(): String = "ーに${this}、二に${this}、三、四がなくて五に${this}"

fun getOneTwoFiveMessage(): String { return "hoge" }