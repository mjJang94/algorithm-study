package baekjoon.bfs_dfs.DFS와BFS

import java.util.*

fun main() {
    val (n, m, start) = readln().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { mutableListOf<Int>() }

    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    for (adj in graph) {
        adj.sort()
    }

    val visitedDfs = BooleanArray(n + 1)
    val visitedBfs = BooleanArray(n + 1)

    fun dfs(v: Int, graph: Array<MutableList<Int>>, visited: BooleanArray) {
        visited[v] = true
        println("$v")
        for (next in graph[v]) {
            if (!visited[next]){
                dfs(next, graph, visited)
            }
        }
    }

    fun bfs(v: Int, graph: Array<MutableList<Int>>, visited: BooleanArray) {
        val queue: Queue<Int> = LinkedList()
        queue.add(v)
        println("$v")
        while (queue.isNotEmpty()) {
            val v = queue.poll()
            for (next in graph[v]) {
                if (!visited[next]) {
                    queue.add(next)
                    visited[next] = true
                }
            }
        }
    }

    dfs(start, graph, visitedDfs)
    println()
    bfs(start, graph, visitedBfs)
}