package leetcode.problems.furthestbuildingyoucanreach_1642

import java.util.*

internal class Solution {
    fun furthestBuilding(heights: List<Int>, bricks: Int, ladders: Int): Int {
        var brickCounter = bricks
        val allocatedLadders: PriorityQueue<Int> = PriorityQueue<Int> { a, b -> a - b }
        heights.indices.forEach { index ->
            val currentHeight = heights[index]
            val nextHeight = heights[index + 1]

            if (currentHeight < nextHeight) {
                val climb = nextHeight - currentHeight
                allocatedLadders.add(climb)
                if (allocatedLadders.size > ladders) {
                    brickCounter -= allocatedLadders.poll()
                    if (brickCounter < 0) {
                        return index
                    }
                }
            }

            if (index == heights.size - 2) {
                return index + 1
            }
        }

        return 0
    }
}
