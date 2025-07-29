package baekjoon.심화2.영단어암기는괴로워

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val words = mutableListOf<String>()

    repeat(n) {
        val w = br.readLine().takeIf { it.length >= m } ?: return@repeat
        words.add(w)
    }
    words.groupBy { it }.entries.sortedWith(
        compareByDescending<Map.Entry<String, List<String>>> { it.value.size }
            .thenByDescending { it.key.length }
            .thenBy { it.key }
    ).forEach {
        bw.appendLine(it.key)
    }

    bw.flush()
    bw.close()
    br.close()
}