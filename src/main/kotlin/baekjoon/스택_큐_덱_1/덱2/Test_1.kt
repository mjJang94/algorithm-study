package baekjoon.스택_큐_덱_1.덱2

fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()
    val deque = ArrayDeque<Int>()

    repeat(n) {
        val order = readln().split(" ")
        when(order.first()) {
            "1" -> deque.addFirst(order.last().toInt())
            "2" -> deque.addLast(order.last().toInt())
            "3" -> deque.removeFirstOrNull()?.let { sb.appendLine(it) } ?: sb.appendLine("-1")
            "4" -> deque.removeLastOrNull()?.let { sb.appendLine(it) } ?: sb.appendLine("-1")
            "5" -> sb.appendLine(deque.size)
            "6" -> if (deque.isEmpty()) sb.appendLine("1") else sb.appendLine("0")
            "7" -> deque.firstOrNull()?.let { sb.appendLine(it) } ?: sb.appendLine("-1")
            "8" -> deque.lastOrNull()?.let { sb.appendLine(it) } ?: sb.appendLine("-1")
        }
    }
    print(sb)
}