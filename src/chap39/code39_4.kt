package chap39

fun main() {
    val list = listOf("あ", "い", "う", "え", "お")
    val action: (String) -> Unit = fun(x) {
        println(x)
    }
    list.forEach(action)

    list.forEach {
        println(it)
    }
}