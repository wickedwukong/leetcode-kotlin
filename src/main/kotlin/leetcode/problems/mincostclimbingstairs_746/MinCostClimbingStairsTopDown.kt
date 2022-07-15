package leetcode.problems.mincostclimbingstairs_746


internal class SolutionTopDown {
    private val memo = HashMap<Int, Int>()
    fun minCostClimbingStairs(cost: IntArray): Int {
        if (cost.size <= 1) {
            return 0
        }

        if (memo.containsKey(cost.size)) {
            return memo[cost.size]!!
        }

        val minimumCost =
            (minCostClimbingStairs(cost.copyOfRange(0, cost.size - 2)) + cost[cost.size - 2]).coerceAtMost(
                minCostClimbingStairs(cost.copyOfRange(0, cost.size - 1)) + cost[cost.size - 1]
            )

        memo[cost.size] = minimumCost

        return memo[cost.size]!!
    }
}
