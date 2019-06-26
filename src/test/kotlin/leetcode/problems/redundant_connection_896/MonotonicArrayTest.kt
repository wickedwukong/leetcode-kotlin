package leetcode.problems.redundant_connection_896

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test


class MonotonicArrayTest {
    @Test
    fun `empty array is always monotonic`() {
        assertThat(Solution().isMonotonic(intArrayOf())).isTrue()
    }

    @Test
    fun `single element array is always monotonic`() {
        assertThat(Solution().isMonotonic(intArrayOf(1))).isTrue()
    }

    @Test
    fun `two element increasing monotonic array`() {
        assertThat(Solution().isMonotonic(intArrayOf(1, 2))).isTrue()
    }

    @Test
    fun `two element decreasing monotonic array`() {
        assertThat(Solution().isMonotonic(intArrayOf(2, 1))).isTrue()
    }
}
