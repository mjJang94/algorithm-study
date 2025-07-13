package bfs.토마토

import java.util.LinkedList
import java.util.Queue

//m = 가로
//n = 세로
fun main() {
    val (m, n) = readln().split(" ").map { it.toInt() }
    val graph = Array(n) { readln().split(" ").map { it.toInt() }.toIntArray() }

    val dx = arrayOf(0, 0, -1, 1)
    val dy = arrayOf(-1, 1, 0, 0)

    val queue: Queue<Pair<Int, Int>> = LinkedList()
    var lastPosition = 0 to 0

    for (x in 0 until m) {
        for (y in 0 until n) {
            if (graph[y][x] == 1) {
                queue.offer(y to x)
            }
        }
    }

    while (queue.isNotEmpty()) {
        val (y, x) = queue.poll()
        for (i in 0 until 4){
            val nx = x + dx[i]
            val ny = y + dy[i]

            if (nx in 0 until m && ny in 0 until n && graph[ny][nx] == 0) {
                queue.offer(ny to nx)
                graph[ny][nx] = graph[y][x] + 1
                lastPosition = ny to nx
            }
        }
    }

    val impossible = graph.any { it -> it.any { it == 0 } }

    if (impossible) {
        print("-1")
    }else {
        val (positionX, positionY) = lastPosition
        val result = graph[positionX][positionY] - 1
        print("$result")
    }
}