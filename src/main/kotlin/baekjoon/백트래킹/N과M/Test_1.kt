package baekjoon.백트래킹.N과M

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val sequence = mutableListOf<Int>()
    val sb = StringBuilder()

    fun backtrack(start: Int) {
        if (sequence.size == m) {
            sb.append(sequence.joinToString(" ")).append("\n")
            return
        }

        for (i in start..n) {
            sequence.add(i)
            backtrack(i)
            sequence.removeLast()
        }
    }

    backtrack(1)
    print(sb)
}