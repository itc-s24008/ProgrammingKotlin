package chap29

import chap28.Car

open class Car(val color: String) {
    var distance: Double = 0.0

    open fun drive(d: Double) {
        distance += d
        println("$color の車が $d km 走りました。")
    }
}

class Prius(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のプリウスが走行を開始しました。")
        println("現在の走行距離: ${distance} km")
        println("燃費を考慮した静かな走り出しです。")
        println("エコモードで快適に走行中です。")
    }
}
