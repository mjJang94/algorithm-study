package leetcode.palindrome

fun main() {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false

        var num = x
        var reversed = 0

        while (num > reversed) {
            val digit = num % 10
            reversed = reversed * 10 + digit
            num /= 10
        }

        return num == reversed || num == reversed / 10
    }

    isPalindrome(121)
}
