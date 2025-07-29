package baekjoon.bfs_dfs.붙임성좋은총총이

fun main() {
    val n = readln().toInt()
    val dancer = mutableSetOf("ChongChong")
    repeat(n){
        val (a, b) = readln().split(" ")

        if (a in dancer || b in dancer) {
            dancer.add(a)
            dancer.add(b)
        }
    }
    println(dancer.size)
}