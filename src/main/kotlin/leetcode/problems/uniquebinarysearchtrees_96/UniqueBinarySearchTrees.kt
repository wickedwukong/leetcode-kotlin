package leetcode.problems.uniquebinarysearchtrees_96

class Solution {
    fun numTrees(n: Int): Int {
        return when (n) {
            0 -> 1
            1 -> 1
            else -> (1..n).fold(0) { acc, x ->
                acc + numTrees(x - 1) * numTrees(n - x)
            }
        }
    }
}
