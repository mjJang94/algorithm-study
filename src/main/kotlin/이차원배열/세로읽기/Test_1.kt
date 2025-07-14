package 이차원배열.세로읽기

fun main() {
    val array = Array(5) { mutableListOf(readln().toCharArray().map { it.toString() }.toMutableList()) }
    val sb = StringBuilder()

    repeat(15) {
        for (row in 0 until 5) {
            sb.append(array[row].firstOrNull()?.let { it.removeFirstOrNull() ?: "" } ?: "")
        }
    }

    print(sb.toString())
}