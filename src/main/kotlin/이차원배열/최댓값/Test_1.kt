package 이차원배열.최댓값

fun main() {

    val array = Array(9) { readln().split(" ").map { it.toInt() }.toIntArray() }

    var max = -1
    var row = 1
    var col = 1

    for (i in 0 until 9) {
        for (j in 0 until 9) {
            if (max < array[i][j]) {
                max = array[i][j]
                row = i + 1
                col = j + 1
            }
        }
    }

    println("$max\n$row $col")
}