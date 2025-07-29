package baekjoon.bfs_dfs.미로탐색

import java.util.LinkedList
import java.util.Queue

/**
 * bfs로 접근하는게 핵심이고 Queue를 사용한다.
 *
 * 방문 기록(visited)을 남기면서 순회하는게 목적이 아니라, 지나간 경로의 회차 수를 업데이트 하면서 순회하는게 목적이다.
 */
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = Array(n) { readln().toCharArray().map { it.digitToInt() }.toIntArray() }

    val dx = arrayOf(0, 0, -1, 1)
    val dy = arrayOf(-1, 1, 0, 0)

    //bfs는 queue로 푼다 이걸로 변경

    fun bfs(x: Int, y: Int) {
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        queue.add(x to y)

        while (queue.isNotEmpty()) {
            val (ax, ay) = queue.poll()

            for (i in 0 until 4) {
                val nx = dx[i] + ax
                val ny = dy[i] + ay

                if (nx in 0 until n && ny in 0 until m && map[nx][ny] == 1) {
                    map[nx][ny] = map[ax][ay] + 1
                    queue.add(nx to ny)
                }
            }
        }
    }
    bfs(0,0)

    print(map[n - 1][m - 1])
}