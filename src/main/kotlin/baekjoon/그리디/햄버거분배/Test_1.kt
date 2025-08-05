package baekjoon.그리디.햄버거분배

fun main() {
    //n = 인원수
    //k = 팔 길이
    val (n, k) = readln().split(" ").map { it.toInt() }
    val words = readln().toCharArray()
    var count = 0
    for (i in 0 until words.size) {
        val word = words[i]
        if (word == 'H' || word == '-') continue

        for (j in (i - k..i + k)) {
            if (j < 0 || j >= words.size) continue
            if (words[j] == 'H') {
                words[j] = '-'
                count++
                break
            }
        }
    }
    println(count)
}