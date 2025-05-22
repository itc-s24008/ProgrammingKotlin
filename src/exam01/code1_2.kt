package exam01

import kotlin.random.Random

fun main() {
    val price = Random.nextInt(1000, 9001) // 1000～9000のランダムな金額
    println("商品価格: ¥$price")

    print("支払う金額を入力してください: ")
    val paid = readLine()?.toIntOrNull()

    if (paid == null) {
        println("数値を正しく入力してください。")
        return
    }

    if (paid < price) {
        println("金額が足りません。")
        return
    }

    var change = paid - price
    println("お釣り: ¥$change")

    val coins = listOf(10000, 5000, 1000, 500, 100, 50, 10, 5, 1)
    for (coin in coins) {
        val count = change / coin
        if (count > 0) {
            println("¥$coin: $count 枚")
        }
        change %= coin
    }
}
