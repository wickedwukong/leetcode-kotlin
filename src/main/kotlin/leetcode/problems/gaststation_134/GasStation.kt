package leetcode.problems.gaststation_134

class Solution {
    fun canCompleteCircuit(gasStations: IntArray, costs: IntArray): Int =
        gasStations.withIndex().find { (index, _) ->
            val circularGasStations = circularRoute(index, gasStations)
            val circularCosts = circularRoute(index, costs)
            val reachedIndex = reachableIndex(circularGasStations, circularCosts)

            reachedIndex == circularGasStations.size - 1
        }?.let {
            it.index
        } ?: -1

    private fun reachableIndex(
        circularGasStations: List<Int>,
        circularCosts: List<Int>
    ): Int {
        var tank = 0
        var reachedIndex = 0
        for ((index, gas) in circularGasStations.withIndex()) {
            tank = tank + gas - circularCosts[index]
            reachedIndex = if (tank < 0) {
                reachedIndex = index
                break
            } else {
                reachedIndex = index
                continue
            }
        }
        return reachedIndex
    }

    private fun circularRoute(index: Int, gasStations: IntArray): List<Int> {
        return gasStations.toList().subList(index, gasStations.size).plus(gasStations.toList().subList(0, index + 1))
    }
}
