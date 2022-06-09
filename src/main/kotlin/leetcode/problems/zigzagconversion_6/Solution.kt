package leetcode.problems.zigzagconversion_6

class Solution(private val text: String, private val numOfRows: Int) {
    fun convert(): String {
        if (numOfRows == 1)
            return text

        var nextRow = 0
        var goingDown = true

        val zigZag: List<MutableList<Char>> = (1..numOfRows).map {
            mutableListOf<Char>()
        }

        for (char in text.toCharArray()) {
            if (goingDown) {
                zigZag[nextRow].add(char)
                if ((nextRow + 1) <= (numOfRows - 1)) {
                    nextRow += 1
                } else {
                    goingDown = false
                    nextRow -= 1
                }
            } else {
                zigZag[nextRow].add(char)
                if ((nextRow - 1) >= 0) {
                    nextRow -= 1
                } else {
                    goingDown = true
                    nextRow += 1
                }
            }
        }

        return zigZag.fold(emptyList()) { acc: List<Char>, rowList: List<Char> ->
            acc.plus(rowList)
        }.joinToString("")
    }
}
