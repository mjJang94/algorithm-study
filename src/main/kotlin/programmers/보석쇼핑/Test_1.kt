package programmers.보석쇼핑

fun main() {
    solution(
        gems = arrayOf("DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA")
    )
}

fun solution(gems: Array<String>): IntArray {
    val totalTypes = gems.toSet().size
    val counts = mutableMapOf<String, Int>()
    var left = 0
    var right = 0
    var minRange = Int.MAX_VALUE
    var answer = intArrayOf(0, 0)

    while (right < gems.size) {
        counts[gems[right]] = counts.getOrDefault(gems[right], 0) + 1
        right++

        while (counts.size == totalTypes) { // 모든 종류 포함
            if (right - left < minRange) {
                minRange = right - left
                answer = intArrayOf(left + 1, right) // 1번 인덱스 기준
            }

            counts[gems[left]] = counts[gems[left]]!! - 1
            if (counts[gems[left]] == 0) counts.remove(gems[left])
            left++
        }
    }

    return answer
}