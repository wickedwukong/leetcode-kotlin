package leetcode.problems.containerwithwostwater_11

import org.assertj.core.api.Assertions
import kotlin.test.Test


internal class ContainerWithMostWaterTest {
    @Test
    fun `max area for 1 height`() {
        Assertions.assertThat(Solution().maxArea(listOf(100))).isEqualTo(0)
    }

    @Test
    fun `max area for 0 height`() {
        Assertions.assertThat(Solution().maxArea(emptyList())).isEqualTo(0)
    }

    @Test
    fun `max area for two heights of 1`() {
        Assertions.assertThat(Solution().maxArea(listOf(1, 1))).isEqualTo(1)
    }

    @Test
    fun `max area for two heights of 1 and 2`() {
        Assertions.assertThat(Solution().maxArea(listOf(1, 2))).isEqualTo(1)
    }

    @Test
    fun `max area for two heights of 2 and 2`() {
        Assertions.assertThat(Solution().maxArea(listOf(2, 2))).isEqualTo(2)
    }

    @Test
    fun `max area for 3 heights of 2, 2, 3`() {
        Assertions.assertThat(Solution().maxArea(listOf(2, 2, 3))).isEqualTo(4)
    }

    @Test
    fun `max area for multiple heights`() {
        Assertions.assertThat(Solution().maxArea(listOf(1, 8, 6, 2, 5, 4, 8, 3, 7))).isEqualTo(49)
    }

}
