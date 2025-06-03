package chap13

fun main() {
    for (x in 1..9) {
        for (y in 1..9) {
//            print("${x}x${y}=${x * y}  ")
            print("%dx%d=%2d  ".format(x, y, x * y))
        }
        println()
    }
}