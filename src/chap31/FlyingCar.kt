package chap31

class FlyingCar(color: String) : Flyable {
    override fun fly() {
        println("すごい！車が空を飛んでいます。")
    }
}