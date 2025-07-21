package 스택_큐_덱_1.풍선터뜨리기

fun main() {
    val n = readln().toInt()
    val move = readln().split(" ").map { it.toInt() }.toIntArray()

    val visited = BooleanArray(n)
    val result = StringBuilder()

    var idx = 0 // 현재 풍선 인덱스
    var count = 0

    while (count < n) {
        result.append("${idx + 1} ")
        val step = move[idx]
        visited[idx] = true
        count++

        if (count == n) break

        var moveCount = kotlin.math.abs(step)
        var direction = if (step > 0) 1 else -1

        while (moveCount > 0) {
            idx = (idx + direction + n) % n
            if (!visited[idx]) moveCount--
        }
    }

    println(result.toString().trim())
}