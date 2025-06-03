package chap05

fun main() {
    val message1 = "こんにちは、世界！\n" +
            "私は Kotlinに関して勉強しています。\n" +
            "Kotlinでは、とても簡単なプログラムを書くことが出来ます。\n" +
            "みなさん、一緒に楽しくプログラミングしましょう！"
    println(message1)
    print("-----")
    val message2 = """|
        |こんにちは、世界！
        |私は Kotlinに関して勉強しています。
        |Kotlinでは、とても簡潔なプログラムを書くことが出来ます。
        |皆さん、一緒に楽しくプログラミングしましょう！
    """.trimMargin()
    println(message2)
    println("-----")
    val world = "世界！"
    val message3 = """
        こんにちは、${world}
        私は Kotlinに関して勉強しています。
        Kotlinでは、とても簡潔なプログラムを書くことが出来ます。
        皆さん、一緒に楽しくプログラミングしましょう！
    """.trimIndent()
    println(message3)
}