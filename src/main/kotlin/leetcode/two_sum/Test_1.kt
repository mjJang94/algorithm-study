package leetcode.two_sum

fun main() {
    val s = twoSum(intArrayOf(3, 2, 4), target = 6)
    print(s.toString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val sb = StringBuilder()
    for (i in 0 until nums.size) {
        for (j in i until nums.size) {
            if (i == j) continue
            if (nums[i] + nums[j] == target) {
                sb.append(i).append(" ").append(j)
            }
        }
    }
    return sb.split(" ").map { it.toInt() }.toIntArray()
}