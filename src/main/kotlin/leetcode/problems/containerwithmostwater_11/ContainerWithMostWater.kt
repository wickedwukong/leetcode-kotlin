package leetcode.problems.containerwithmostwater_11

class Solution {
    fun maxArea(heights: List<Int>): Int {
        if (heights.size <= 1) {
            return 0
        }

        var maxArea = -1

        heights.forEachIndexed{ index, height ->
            val theRestOfHeights = heights.subList(index + 1, heights.size)

            val potentialMaxAreas = theRestOfHeights.mapIndexed { indexOfTheRest, heightOfTheRest ->
                height.coerceAtMost(heightOfTheRest) * (indexOfTheRest + 1)
            }

            potentialMaxAreas.forEach{ potentialMaxArea ->
                if (maxArea < potentialMaxArea) {
                    maxArea = potentialMaxArea
                }

            }
        }

        return maxArea
    }
}
