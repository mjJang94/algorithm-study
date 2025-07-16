package 브루트포스

fun main() {
    val n = readln().toInt()
    var count = 0
    var result = 0
    for (i in 666 until Int.MAX_VALUE) {

        if (i.toString().contains("666")) {
            count++
        }

        if (count == n) {
            result = i
            break
        }
    }

    print(result)
}