package leetcode.problems.powxn_50

class Solution {
    companion object {
        fun pow(x: Double, n: Int): Double {
            return if (n < 0)
                powToPositive(1 / x, -n)
            else
                powToPositive(x, n)
        }

        private fun powToPositive(x: Double, n: Int) = (0 until n).fold(1.0) { acc, _ ->
            acc * x
        }
    }
}
