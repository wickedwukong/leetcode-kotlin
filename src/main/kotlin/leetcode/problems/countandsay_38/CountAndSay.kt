package leetcode.problems.countandsay_38

class Solution {
    fun countAndSay(n: Int): String {
        return if (n == 1) {
            "1"
        } else {
            val countAndSay = countAndSay(n - 1)
            say(countAndSay.toCharArray().toList())
        }
    }

    fun say(chars: List<Char>): String {
        if (chars.isEmpty()) {
            return ""
        }

        val firstChar = chars.first()
        val remainingChars = chars.drop(1)

        val sameChars = remainingChars.takeWhile { char -> char == firstChar }

        return "${sameChars.size + 1}$firstChar${say(chars.subList(1 + sameChars.size, chars.size ))}"
    }
}
