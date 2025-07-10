package org.example.단지번호붙이기_DFS

/**
 * 3차 문제 풀이
 */
fun main() {
    val n = readln().toInt()
    val map = Array(n) { readln().toCharArray().map { it.digitToInt() }.toIntArray() }
    val visited = Array(n) { BooleanArray(n) }
    val houseCounter = mutableListOf<Int>()

    val dx = arrayOf(0, 0, -1, 1)
    val dy = arrayOf(-1, 1, 0, 0)

    fun dfs(x: Int, y: Int): Int {

        var counter = 1
        visited[x][y] = true

        for (i in 0 until 4) {
            val nx = dx[i] + x
            val ny = dy[i] + y

            if (nx in 0 until n && ny in 0 until n && !visited[nx][ny] && map[nx][ny] == 1) {
                counter += dfs(nx, ny)
            }
        }
        return counter
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (!visited[i][j] && map[i][j] == 1) {
                houseCounter.add(dfs(i, j))
            }
        }
    }

    println(houseCounter.size)
    houseCounter.sort()
    houseCounter.forEach {
        println(it)
    }
}
