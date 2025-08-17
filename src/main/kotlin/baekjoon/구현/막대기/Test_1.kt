package baekjoon.구현.막대기


fun main() {
    val N = readln().toInt()
    val array = IntArray(N)

    repeat(N) {
        array[it] = readln().toInt()
    }

    var count = 0
    var current = 0
    for (i in (N - 1) downTo 0 ) {
        if (array[i] > current) {
            current = array[i]
            count++
        }
    }

    print(count)
}