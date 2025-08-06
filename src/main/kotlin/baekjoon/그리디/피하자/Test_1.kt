package baekjoon.그리디.피하자

fun main() {
    val n = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }

    val cntLeft = LongArray(2)
    val cnt = LongArray(2)

    for (a in arr) {
        val idx = a % 2
        cnt[idx]++
        cntLeft[idx] += cnt[1 - idx]
    }

    println(minOf(cntLeft[0], cntLeft[1]))
}