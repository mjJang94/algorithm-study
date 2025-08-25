package baekjoon.다이나믹프로그래밍.더하기

fun main() {
    val t = readln().toInt()
    val nums = IntArray(t) { readln().toInt() }
    val maxN = nums.maxOrNull() ?: 0

    val dp = IntArray(maxN + 1)

    if (maxN >= 1) dp[1] = 1
    if (maxN >= 2) dp[2] = 2
    if (maxN >= 3) dp[3] = 4

    for (i in 4..maxN) {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
    }

    nums.forEach {
        println(dp[it])
    }
}