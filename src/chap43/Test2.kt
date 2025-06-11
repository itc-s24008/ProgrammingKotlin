package chap43

public fun testPublic() {
    println("可視性修飾子がpublicです。")
}

private fun testPrivate() {
    println("可視性修飾子がprivateです。")
}

fun testPublic2() {
    println("public な関数から privateの関数を呼び出す")
    testPrivate()
}

public class TestPublic() {
//    private val privateObject = TestPrivate()
//    val testClass: TestAbatract = private
}

private class TestPublic2() {

}