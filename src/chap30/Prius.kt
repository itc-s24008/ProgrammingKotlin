package chap30

class Prius(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のプリウスが走行を開始しました。")
        println("現在の走行距離: ${distance} km")
        println("燃費を考慮した静かな走り出しです。")
        println("エコモードで快適に走行中です。")
    }
}

