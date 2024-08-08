package org.example.quiz_1

fun sumOfOdds() {
    val scanner = java.util.Scanner(System.`in`)
    val N = scanner.nextInt()

    repeat(N) {
        val num = scanner.nextInt()
        println(sum(num))
    }
}

fun sum(num: Int): Int {
    var sum = 0
    for (i in 1..num step 2) {
        sum += i
    }
    return sum
}
