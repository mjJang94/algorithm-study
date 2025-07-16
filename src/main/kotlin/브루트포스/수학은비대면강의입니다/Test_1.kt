package 브루트포스.수학은비대면강의입니다


/**
 * 2개의 미지수를 갖는 연립방정식을 풀때는 크래머의 공식을 사용한다.

 * <크래머의 공식>
 *
 * 행렬식 D = ae -bd
 *
 * x = (c * e) - (b * f) / (a * e) - (b * d)
 * y = (a * f) - (c * d) / (a * e) - (b * d)
 */

fun main() {
    val input = readln().split(" ").map { it.toInt() }
    val a = input[0]
    val b = input[1]
    val c = input[2]
    val d = input[3]
    val e = input[4]
    val f = input[5]

    val denominator = a * e - b * d
    val x = (c * e - b * f) / denominator
    val y = (a * f - c * d) / denominator

    println("$x $y")
}