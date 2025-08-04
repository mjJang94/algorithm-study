package leetcode.add_two_numbers

fun main() {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var curr1 = l1
        val nums = StringBuilder()
        while (curr1 != null) {
            nums.append(curr1.`val`)
            curr1 = curr1.next
        }

        nums.append(" ")

        var curr2 = l2
        while (curr2 != null) {
            nums.append(curr2.`val`)
            curr2 = curr2.next
        }

        val sum = nums.reverse().split(" ").sumOf { it.toBigInteger() }.toString().map { it.digitToInt() }.asReversed()
        val result = toListNode(sum)

        return result
    }

    addTwoNumbers(
        toListNode(
            listOf(
                1,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                1
            )
        ), toListNode(listOf(5, 6, 4))
    )
}

fun toListNode(nums: List<Int>): ListNode? {
    if (nums.isEmpty()) return null
    val dummy = ListNode(0)
    var current = dummy
    for (num in nums) {
        current.next = ListNode(num)
        current = current.next!!
    }
    return dummy.next
}

class ListNode(
    var `val`: Int,
    var next: ListNode? = null
)