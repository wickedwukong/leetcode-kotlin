package leetcode.problems.redundant_connection_896

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test


class MonotonicArrayTest {
    @Test
    fun `empty array is always monotonic`() {
        assertThat(Solution().isMonotonic(intArrayOf())).isTrue()
    }

    @Test
    fun `1 element array is always monotonic`() {
        assertThat(Solution().isMonotonic(intArrayOf(1))).isTrue()
    }

    @Test
    fun `2 element increasing monotonic array`() {
        assertThat(Solution().isMonotonic(intArrayOf(1, 2))).isTrue()
    }

    @Test
    fun `3 element increasing monotonic array`() {
        assertThat(Solution().isMonotonic(intArrayOf(1, 2, 3))).isTrue()
    }

    @Test
    fun `3 element decreasing monotonic array`() {
        assertThat(Solution().isMonotonic(intArrayOf(3, 2, 1))).isTrue()
    }

    @Test
    fun `two equal elements is a monotonic array`() {
        assertThat(Solution().isMonotonic(intArrayOf(1, 1))).isTrue()
    }

    @Test
    fun `more comprehensive tests - sample date`() {
        assertThat(Solution().isMonotonic(intArrayOf(1,2,2,3))).isTrue()
        assertThat(Solution().isMonotonic(intArrayOf(6,5,4,4))).isTrue()
        assertThat(Solution().isMonotonic(intArrayOf(1,3,2))).isFalse()
        assertThat(Solution().isMonotonic(intArrayOf(1,2,4,5))).isTrue()
        assertThat(Solution().isMonotonic(intArrayOf(1,1,1))).isTrue()
    }

}
