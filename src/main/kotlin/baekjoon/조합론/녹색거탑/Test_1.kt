package baekjoon.조합론.녹색거탑

fun main() {
    val n = readln().toInt()
    print(dfs(0, 0, n))
}

fun dfs(level: Int, index: Int, n: Int): Int {
    if (level == n) return 1
    return dfs(level + 1, index, n) + dfs(level + 1, index + 1, n)
}