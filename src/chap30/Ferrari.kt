package chap30

import chap28.Car

class Ferrari(color: String) : Car(color) {
    override fun drive(d: Double) {
        println("${color}のフェラーリが走っています！ブォォォーン！")
        println("おおっ、かっこいい！！！")
        println("マイレージは ${distance} キロになったぜい！")
    }
}