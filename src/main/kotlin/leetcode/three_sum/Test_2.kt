package leetcode.three_sum

/**
 * 투 포인터로 풀이
 * 이 경우에도 시간복잡도는 O(n^2)이지만 풀린다
 */
fun main() {
    val s = threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
    print(s)
}

private fun threeSum(nums: IntArray): List<List<Int>> {
    val set = mutableSetOf<List<Int>>()
    nums.sort()

    for (i in 0 until nums.size - 2) {
        var left = i + 1
        var right = nums.size - 1
        while (left < right) {
            val sum = nums[i] + nums[left] + nums[right]

            if (sum == 0) {
                set.add(listOf(nums[i], nums[left], nums[right]))
                left++
                right--
            }
            else if (sum < 0) left++
            else right --
        }
    }

    return set.toList()
}