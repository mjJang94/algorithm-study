package 스택_큐_덱_1.queuestack

fun main() {

    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }
    val queueStack = readln().split(" ").map { it.toInt() }.toMutableList()

    var m = readln().toInt()
    val inserts = readln().split(" ").map { it.toInt() }

    val sb = StringBuilder()


    for (i in n - 1 downTo 0) {
        if (m == 0) break
        if (a[i] == 0) {
            sb.append("${queueStack[i]} ")
            m--
        }
    }

    for (i in inserts.indices) {
        if (m == 0) break
        sb.append("${inserts[i]} ")
        m--
    }

    print(sb)
}