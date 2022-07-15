package leetcode.problems.mincostclimbingstairs_746

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

internal class MinCostClimbingStairsBottomUpTest {

    @Test
    fun `test cases`() {
        assertThat(SolutionBottomUp().minCostClimbingStairs(listOf(100).toIntArray())).isEqualTo(0)
        assertThat(SolutionBottomUp().minCostClimbingStairs(listOf(100, 1000).toIntArray())).isEqualTo(100)
        assertThat(SolutionBottomUp().minCostClimbingStairs(listOf(10, 15, 20).toIntArray())).isEqualTo(15)
        assertThat(SolutionBottomUp().minCostClimbingStairs(listOf(0,1,2,3,4,5).toIntArray())).isEqualTo(6)
        assertThat(SolutionBottomUp().minCostClimbingStairs(listOf(1).toIntArray())).isEqualTo(0)
        assertThat(SolutionBottomUp().minCostClimbingStairs(listOf(1, 100).toIntArray())).isEqualTo(1)
        assertThat(SolutionBottomUp().minCostClimbingStairs(listOf(1, 100, 1).toIntArray())).isEqualTo(2)
        assertThat(SolutionBottomUp().minCostClimbingStairs(listOf(1, 100, 1, 1).toIntArray())).isEqualTo(2)
        assertThat(SolutionBottomUp().minCostClimbingStairs(listOf(1, 100, 1, 1, 1).toIntArray())).isEqualTo(3)
        assertThat(SolutionBottomUp().minCostClimbingStairs(listOf(1, 100, 1, 1, 1, 100).toIntArray())).isEqualTo(3)
        assertThat(SolutionBottomUp().minCostClimbingStairs(listOf(1, 100, 1, 1, 1, 100, 1).toIntArray())).isEqualTo(4)
        assertThat(SolutionBottomUp().minCostClimbingStairs(listOf(1, 100, 1, 1, 1, 100, 1, 1, 100).toIntArray())).isEqualTo(5)
        assertThat(SolutionBottomUp().minCostClimbingStairs(listOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1).toIntArray())).isEqualTo(
            6
        )
    }
}
