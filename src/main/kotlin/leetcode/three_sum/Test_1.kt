package leetcode.three_sum

fun main() {
    val s = threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
    print(s)
}

private fun threeSum(nums: IntArray): List<List<Int>> {
    val ss = nums.sorted()
    val result = mutableSetOf<List<Int>>()

    var a = 0
    var b = 1
    var c = 2

    while (true) {
        val sum = ss[a] + ss[b] + ss[c]
        if (sum == 0) {
            val answer = listOf(ss[a], ss[b], ss[c])
            result.add(answer)
        }

        when {
            c + 1 < ss.size -> {
                c++
            }

            b + 1 < ss.size - 1 -> {
                b++
                c = b + 1
            }

            a + 1 < ss.size - 2 -> {
                a++
                b = a + 1
                c = b + 1
            }

            else -> break
        }
    }
    return result.toList()
}

