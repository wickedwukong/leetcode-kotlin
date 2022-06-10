package leetcode.problems.multiplystrings_43

class Solution {
    private val chartToDigitMap =
        mapOf('0' to 0, '1' to 1, '2' to 2, '3' to 3, '4' to 4, '5' to 5, '6' to 6, '7' to 7, '8' to 8, '9' to 9)


    fun multiply(value1: String, value2: String): String {
        return (toNumber(value1) * toNumber(value2)).toString()
    }

    private fun toNumber(value1: String): Int {
        return value1.toCharArray().map { chartToDigitMap[it] }.filterNotNull().fold(0) { acc, it ->
            acc * 10 + it
        }
    }
}
