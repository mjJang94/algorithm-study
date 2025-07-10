package DFS와BFS

import java.util.LinkedList
import java.util.Queue

fun main() {
    val (n, m, start) = readln().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { mutableListOf<Int>() }
    val visitedDfs = BooleanArray(n + 1)
    val visitedBfs = BooleanArray(n + 1)

    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    graph.map { it.sort() }


    fun dfs(start: Int, graph: Array<MutableList<Int>>, visited: BooleanArray) {
        visited[start] = true
        print("$start")
        for (next in graph[start]) {
            if (!visited[next]) {
                dfs(next, graph, visited)
            }
        }
    }

    fun bfs(start: Int, graph: Array<MutableList<Int>>, visited: BooleanArray) {
        val queue: Queue<Int> = LinkedList()
        queue.add(start)
        visited[start] = true

        while (queue.isNotEmpty()) {
            val v = queue.poll()
            print("$v")
            for (next in graph[v]) {
                if (!visited[next]) {
                    visited[next] = true
                    queue.add(next)
                }
            }
        }
    }

    dfs(start, graph, visitedDfs)
    println()
    bfs(start, graph, visitedBfs)
}