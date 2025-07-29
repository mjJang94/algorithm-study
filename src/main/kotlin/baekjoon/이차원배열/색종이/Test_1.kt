package baekjoon.이차원배열.색종이

fun main() {
    val n = readln().toInt()

    var count = 0

    val paper = Array(100) { BooleanArray(100) { false} }

    repeat(n) {
        val (col, row) = readln().split(" ").map { it.toInt() }

        for (y in row until row + 10) {
            for (x in col until col + 10) {
                paper[y][x] = true
            }
        }
    }

    for (i in 0 until 100) {
        for (j in 0 until 100) {
            if (paper[j][i]) count ++
        }
    }

    println(count)
}


