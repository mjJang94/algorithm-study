package baekjoon.그리디.동전0

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val money = IntArray(n)
    repeat(n) { index ->
        money[index] = readln().toInt()
    }

    var count = 0
    var exchange = k
    for (i in money.size - 1 downTo 0){
        val m = money[i]
        if (exchange / m > 0){
            count += exchange / m
            exchange = k % m
        }
    }

    print(count)
}