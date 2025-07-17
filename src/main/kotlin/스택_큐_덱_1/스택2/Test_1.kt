package 스택_큐_덱_1.스택2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val n = br.readLine().toInt()
    val stack = ArrayDeque<Int>()

    repeat(n) {
        val input = br.readLine()
        if (input.startsWith("1")) {
            val (_, number) = input.split(" ")
            stack.addFirst(number.toInt())
        } else {
            when (input.toInt()) {
                2 -> sb.appendLine(stack.removeFirstOrNull() ?: -1)
                3 -> sb.appendLine(stack.size)
                4 -> sb.appendLine(if (stack.isNotEmpty()) 0 else 1)
                5 -> sb.appendLine(stack.firstOrNull() ?: -1)
            }
        }
    }
    print(sb)
}