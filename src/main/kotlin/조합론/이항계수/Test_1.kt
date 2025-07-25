package 조합론.이항계수

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    print(factorial(n) / (factorial(k) * factorial(n - k)))
}

fun factorial(number: Int): Int {
    return (1..number).fold(1) { acc, num ->
        acc * num
    }
}