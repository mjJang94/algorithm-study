package 이차원배열.행렬덧셈

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    val arrayA = Array(n) {  readln().split(" ").map { it.toInt() }.toIntArray() }
    val arrayB = Array(n) {  readln().split(" ").map { it.toInt() }.toIntArray() }

    for(i in 0 until n) {
        for (j in 0 until m) {
            val result = arrayA[i][j] + arrayB[i][j]
            print("$result ")
        }
        println()
    }
}