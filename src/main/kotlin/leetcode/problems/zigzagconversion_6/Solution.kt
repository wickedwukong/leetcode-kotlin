package leetcode.problems.zigzagconversion_6

class Solution(private val text: String, val numOfRows: Int) {
    fun convert(): String {
        val chars = text.toCharArray()
        var currentRow = 0
        var previousCharIndex = 0

        val zigZag: List<MutableList<Char>> = (1..numOfRows).map {
            mutableListOf<Char>()
        }

        for (char in chars) {
            if (currentRow <= (numOfRows - 1)) {
                zigZag[currentRow].add(previousCharIndex, char)
                if (currentRow < (numOfRows - 1))
                   currentRow += 1
                else if (currentRow != 0) {
                    previousCharIndex += 1
                    currentRow -= 1
                }
            }
            else {
                currentRow -= 1
                previousCharIndex += 1
                zigZag[currentRow].add(previousCharIndex, char)
            }

        }
        val x: List<List<Char>> = zigZag.map { rowList -> rowList.filterNotNull() }

        val result  = x.fold(emptyList<Char>()) { acc: List<Char>, rowList: List<Char> ->
            acc.plus(rowList)
        }

        return result.joinToString("")
    }
}
