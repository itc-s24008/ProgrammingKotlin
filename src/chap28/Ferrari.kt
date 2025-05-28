package chap28

class Ferrari(color: String) : Car(color) {
    override fun drive(d: Double) {
        println("${color}のフェラーリが走っています！ブォォォーン！")
        println("おおっ、かっこいい！！！")
        println("マイレージは ${distance} キロになったぜい！")
    }
}