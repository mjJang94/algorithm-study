package leetcode.longest_substring_without_repeating_characters


fun main() {
    println(lengthOfLongestSubstring("abcabcbb"))
}

fun lengthOfLongestSubstring(s: String): Int {
    var maxLength = 0
    val seen = mutableMapOf<Char, Int>()
    var start = 0

    for (end in s.indices) {
        val ch = s[end]
        if (seen.containsKey(ch) && seen[ch]!! >= start) {
            start = seen[ch]!! + 1
        }
        seen[ch] = end
        maxLength = maxOf(maxLength, end - start + 1)
    }

    return maxLength
}