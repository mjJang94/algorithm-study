package baekjoon.브루트포스.회전초밥

fun main() {
    val (N, d, k ,c) = readln().split(" ").map { it.toInt() }

    val arr = IntArray(N)
    repeat(N){
        arr[it] = readln().toInt()
    }

    var maxSushi = 0
    for (i in 0 until N) {
        var eatSushi = 1
        val check = IntArray(d + 1)
        check[c] = 1

        for (j in i until i + k) {
            val sushi = arr[j % N]
            if (check[sushi] == 0) {
                eatSushi++
            }
            check[sushi]++
        }
        maxSushi = maxOf(maxSushi, eatSushi)
    }

    println(maxSushi)
}