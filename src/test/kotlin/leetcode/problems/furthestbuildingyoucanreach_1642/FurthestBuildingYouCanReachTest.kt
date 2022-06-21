package leetcode.problems.furthestbuildingyoucanreach_1642

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

internal class FurthestBuildingYouCanReachTest {
    @Test
    fun `1 height`() {
        assertThat(Solution().furthestBuilding(listOf(), 0, 0)).isEqualTo(0)
    }

    @Test
    fun `2 heights with coming down - no climb`() {
        assertThat(Solution().furthestBuilding(listOf(2, 1), 0, 0)).isEqualTo(1)
    }

    @Test
    fun `2 heights a ladder climb`() {
        assertThat(Solution().furthestBuilding(listOf(1, 2), 0, 1)).isEqualTo(1)
    }

    @Test
    fun `2 heights a brick climb`() {
        assertThat(Solution().furthestBuilding(listOf(1, 2), 1, 0)).isEqualTo(1)
    }

    @Test
    fun `3 heights a brick and a ladder climb`() {
        assertThat(Solution().furthestBuilding(listOf(1, 2, 4), 1, 1)).isEqualTo(2)
    }

    @Test
    fun `3 heights a ladder and a brick climb`() {
        assertThat(Solution().furthestBuilding(listOf(1, 3, 4), 1, 1)).isEqualTo(2)
    }

    @Test
    fun `comprehensive examples`() {
        assertThat(Solution().furthestBuilding(listOf(4, 2, 7, 6, 9, 14, 12), 5, 1)).isEqualTo(4)
        assertThat(Solution().furthestBuilding(listOf(4, 12, 2, 7, 3, 18, 20, 3, 19), 10, 2)).isEqualTo(7)
        assertThat(Solution().furthestBuilding(listOf(14, 3, 19, 3), 17, 0)).isEqualTo(3)
    }

}
