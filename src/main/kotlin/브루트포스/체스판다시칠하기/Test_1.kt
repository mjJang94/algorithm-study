package 브루트포스.체스판다시칠하기

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val board = List(n) { readln() }

    var minPaint = Int.MAX_VALUE

    for (i in 0..n - 8) {
        for (j in 0..m - 8) {

            val paintCount = countPaint(board, i, j)
            minPaint = minOf(minPaint, paintCount)
        }
    }
    print(minPaint)
}

fun countPaint(board: List<String>, row: Int, col: Int): Int {
    var countW = 0
    var countB = 0

    for (i in 0 until 8) {
        for (j in 0 until 8) {
            val current = board[row + i][col + j]
            val expectedW = if ((i+j) % 2 == 0) 'W' else 'B'
            val expectedB = if ((i+j) % 2 == 0) 'B' else 'W'

            if (current != expectedW) countW++
            if (current != expectedB) countB++
        }
    }
    return minOf(countW, countB)
}