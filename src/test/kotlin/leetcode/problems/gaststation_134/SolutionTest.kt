package leetcode.problems.gaststation_134

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

internal class SolutionTest {
    @Test
    fun `empty gas stations & costs`() {
        assertThat(Solution().canCompleteCircuit(intArrayOf(), intArrayOf())).isEqualTo(-1)
    }

    @Test
    fun `1 element station costs - reachable`() {
        assertThat(Solution().canCompleteCircuit(intArrayOf(1), intArrayOf(1))).isEqualTo(0)
    }

    @Test
    fun `1 element station costs - unreachable`() {
        assertThat(Solution().canCompleteCircuit(intArrayOf(1), intArrayOf(2))).isEqualTo(-1)
    }

    @Test
    fun `2 element station costs - reachable`() {
        assertThat(Solution().canCompleteCircuit(intArrayOf(1, 2), intArrayOf(1,2))).isEqualTo(0)
    }

    @Test
    fun `pass for sample data`() {
        assertThat(Solution().canCompleteCircuit(intArrayOf(1, 2, 3, 4, 5), intArrayOf(3, 4, 5, 1, 2))).isEqualTo(3)
        assertThat(Solution().canCompleteCircuit(intArrayOf(2, 3, 4), intArrayOf(3, 4, 3))).isEqualTo(-1)
    }
}
