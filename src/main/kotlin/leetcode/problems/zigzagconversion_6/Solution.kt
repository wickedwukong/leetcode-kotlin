package leetcode.problems.zigzagconversion_6

class Solution(private val text: String, val numOfRows: Int) {
    fun convert(): String {
        val chars = text.toCharArray()
        var nextRow = -1
        var goingDown = true

        val zigZag: List<MutableList<Char>> = (1..numOfRows).map {
            mutableListOf<Char>()
        }

        for (char in chars) {
            if (goingDown) {
                if ((nextRow + 1) <= (numOfRows - 1)) {
                    nextRow += 1
                    zigZag[nextRow].add(char)
                } else {
                    goingDown = false
                    if (nextRow >= 1)
                        nextRow -= 1
                    zigZag[nextRow].add(char)
                }
            } else {
                if ((nextRow - 1) >= 0) {
                    nextRow -= 1
                    zigZag[nextRow].add(char)
                } else {
                    goingDown = true
                    if (numOfRows > 1)
                        nextRow += 1
                    zigZag[nextRow].add(char)
                }
            }
        }

        val result = zigZag.fold(emptyList()) { acc: List<Char>, rowList: List<Char> ->
            acc.plus(rowList)
        }

        return result.joinToString("")
    }
}
