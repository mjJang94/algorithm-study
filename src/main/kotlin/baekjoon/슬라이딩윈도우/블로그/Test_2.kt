package baekjoon.슬라이딩윈도우.블로그

fun main() {
    val (n, x) = readln().split(" ").map { it.toInt() }
    val days = readln().split(" ").map { it.toInt() }
    var windowSum = days.take(x).sum()
    var maxSum = windowSum

    var count = 1

    for (i in x until days.size) {
        windowSum = windowSum - days[i - x] + days[i]
        when {
            windowSum > maxSum -> {
                maxSum = windowSum
                count = 1
            }

            windowSum == maxSum -> count++
        }
    }

    if (maxSum == 0) {
        print("SAD")
    }else {
        println(maxSum)
        print(count)
    }
}