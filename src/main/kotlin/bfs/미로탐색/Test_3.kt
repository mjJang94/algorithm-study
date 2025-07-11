package bfs.미로탐색

import java.util.LinkedList
import java.util.Queue

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val graph = Array(n) { readln().toCharArray().map { it.digitToInt() }.toIntArray() }

    val dx = arrayOf(0, 0, -1, 1)
    val dy = arrayOf(-1, 1, 0, 0)

    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.add(0 to 0)

    while (queue.isNotEmpty()) {

        val (x, y) = queue.poll()

        for (i in 0 until 4) {
            val nx = dx[i] + x
            val ny = dy[i] + y

            if (nx in 0 until n && ny in 0 until m && graph[nx][ny] == 1) {
                queue.add(nx to ny)
                graph[nx][ny] = graph[x][y] + 1
            }
        }
    }
    println(graph[n - 1][m - 1])
}