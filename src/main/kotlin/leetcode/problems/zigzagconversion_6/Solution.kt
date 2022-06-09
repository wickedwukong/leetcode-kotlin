package leetcode.problems.zigzagconversion_6

class Solution(private val text: String, private val numOfRows: Int) {
    fun convert(): String {
        val chars = text.toCharArray()
        var nextRow = 0
        var goingDown = true

        val zigZag: List<MutableList<Char>> = (1..numOfRows).map {
            mutableListOf<Char>()
        }

        for (char in chars) {
            if (goingDown) {
                zigZag[nextRow].add(char)
                if ((nextRow + 1) <= (numOfRows - 1)) {
                    nextRow += 1
                } else {
                    goingDown = false
                    if (numOfRows > 1)
                        nextRow -= 1
                }
            } else {
                zigZag[nextRow].add(char)
                if ((nextRow - 1) >= 0) {
                    nextRow -= 1
                } else {
                    goingDown = true
                    if (numOfRows > 1)
                        nextRow += 1
                }
            }
        }

        return zigZag.fold(emptyList()) { acc: List<Char>, rowList: List<Char> ->
            acc.plus(rowList)
        }.joinToString("")
    }
}
