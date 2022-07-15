package leetcode.problems.mincostclimbingstairs_746

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

internal class MinCostClimbingStairsTopDownTest {

    @Test
    fun `test cases`() {
        assertThat(SolutionTopDown().minCostClimbingStairs(listOf(100).toIntArray())).isEqualTo(0)
        assertThat(SolutionTopDown().minCostClimbingStairs(listOf(100, 1000).toIntArray())).isEqualTo(100)
        assertThat(SolutionTopDown().minCostClimbingStairs(listOf(10, 15, 20).toIntArray())).isEqualTo(15)
        assertThat(SolutionTopDown().minCostClimbingStairs(listOf(0,1,2,3,4,5).toIntArray())).isEqualTo(6)
        assertThat(SolutionTopDown().minCostClimbingStairs(listOf(1).toIntArray())).isEqualTo(0)
        assertThat(SolutionTopDown().minCostClimbingStairs(listOf(1, 100).toIntArray())).isEqualTo(1)
        assertThat(SolutionTopDown().minCostClimbingStairs(listOf(1, 100, 1).toIntArray())).isEqualTo(2)
        assertThat(SolutionTopDown().minCostClimbingStairs(listOf(1, 100, 1, 1).toIntArray())).isEqualTo(2)
        assertThat(SolutionTopDown().minCostClimbingStairs(listOf(1, 100, 1, 1, 1).toIntArray())).isEqualTo(3)
        assertThat(SolutionTopDown().minCostClimbingStairs(listOf(1, 100, 1, 1, 1, 100).toIntArray())).isEqualTo(3)
        assertThat(SolutionTopDown().minCostClimbingStairs(listOf(1, 100, 1, 1, 1, 100, 1).toIntArray())).isEqualTo(4)
        assertThat(SolutionTopDown().minCostClimbingStairs(listOf(1, 100, 1, 1, 1, 100, 1, 1, 100).toIntArray())).isEqualTo(5)
        assertThat(SolutionTopDown().minCostClimbingStairs(listOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1).toIntArray())).isEqualTo(
            6
        )
    }
}
