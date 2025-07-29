package 심화2.약수

fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }

    print(numbers.max() * numbers.min())
}