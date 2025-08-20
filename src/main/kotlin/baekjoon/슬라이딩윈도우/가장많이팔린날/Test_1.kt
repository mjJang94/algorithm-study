package baekjoon.슬라이딩윈도우.가장많이팔린날


/**
 * 인형을 판매하는데, N일동안 가장 많이 팔린 구간을 구하고 싶다.
 * input
 * 5
 * 5 3 2 5 7 1 4 6 4 3 8 2
 */

fun main() {
    val N = readln().toInt()
    val array = readln().split(" ").map { it.toInt() }

    var sum = array.take(N).sum()
    var maxCount = sum

    var bestLeft = 0
    var bestRight = N - 1

    var left = 1
    var right = N

    while (right < array.size) {
        sum = sum - array[left - 1] + array[right]
        if (sum > maxCount) {
            maxCount = sum
            bestLeft = left
            bestRight = right
        }
        left++
        right++
    }

    println("가장 많이 팔린 갯수 : $maxCount")
    println("가장 많이 팔린 인덱스 : $bestLeft ~ $bestRight")
    println("가장 많이 팔린 구간 : ${array.slice(bestLeft .. bestRight)}")
}