package leetcode.problems.redundant_connection_896

class Solution {
    fun isMonotonic(values: IntArray): Boolean {
        if (values.isEmpty()) return true

        return isIncreasing(values) || isDecreasing(values)
    }

    private fun isDecreasing(values: IntArray): Boolean {
        return values.toList().windowed(2, 1).all{
            it[0] >= it[1]
        }
    }

    private fun isIncreasing(values: IntArray): Boolean {
        return values.toList().windowed(2, 1).all{
            it[0] <= it[1]
        }
    }
}
