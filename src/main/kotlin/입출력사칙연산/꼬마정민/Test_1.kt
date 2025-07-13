package 입출력사칙연산.꼬마정민



fun main() {
    val (a, b, c) = readln().split(" ").map { it.toLong() }
    print(a + b + c)
}