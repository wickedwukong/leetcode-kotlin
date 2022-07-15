package leetcode.problems.mincostclimbingstairs_746

class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val minimumCost: MutableList<Int> = (0 .. cost.size).map { 0 }.toMutableList()

        for (i in 2 until minimumCost.size) {
            val takeOneStep = minimumCost[i - 1] + cost[i - 1]
            val takeTwoSteps = minimumCost[i - 2] + cost[i - 2]
            minimumCost[i] = takeOneStep.coerceAtMost(takeTwoSteps)
        }

        return minimumCost.last()
    }
}
