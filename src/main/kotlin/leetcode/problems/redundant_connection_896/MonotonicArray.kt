package leetcode.problems.redundant_connection_896

class Solution {
    fun isMonotonic(values: IntArray): Boolean {
        if (values.isEmpty()) return true

        val initialValue = values[0]
        val increaseResult = values.toList().drop(1).fold(Pair(true, initialValue), { acc, value ->
            Pair(acc.first && value >= acc.second, value)
        })


        val decreaseResult = values.toList().drop(1).fold(Pair(true, initialValue), { acc, value ->
            Pair(acc.first && value <= acc.second, value)
        })

        return increaseResult.first || decreaseResult.first
    }
}
