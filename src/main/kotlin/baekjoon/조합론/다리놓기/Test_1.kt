package baekjoon.조합론.다리놓기

fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()

    repeat(t) {
        val (n, m) = readln().split(" ").map { it.toInt() }
        sb.appendLine(combination(m, n))
    }

    print(sb)
}

fun combination(n: Int, r: Int): Long {
    var result = 1L
    for (i in 1..r) {
        result = result * (n - i + 1) / i
    }
    return result
}