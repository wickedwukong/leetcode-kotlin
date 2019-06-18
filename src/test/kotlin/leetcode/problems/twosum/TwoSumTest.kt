package leetcode.problems.twosum

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class TwoSumTest {

    @Test
    fun `should work for sample test data`() {
        assertThat(Solution().twoSum(intArrayOf(2, 7, 11, 15), 9)).isEqualTo(intArrayOf(0, 1))
    }

    @Test
    fun `should work for an array which has duplicated data`() {
        assertThat(Solution().twoSum(intArrayOf(3, 3), 6)).isEqualTo(intArrayOf(0, 1))
        assertThat(Solution().twoSum(intArrayOf(3, 2, 3), 6)).isEqualTo(intArrayOf(0, 2))
    }

    @Test
    fun `should report no index for empty and one-element array`() {
        assertThat(Solution().twoSum(intArrayOf(), 0)).isEqualTo(intArrayOf())
        assertThat(Solution().twoSum(intArrayOf(3), 3)).isEqualTo(intArrayOf())
    }
}
