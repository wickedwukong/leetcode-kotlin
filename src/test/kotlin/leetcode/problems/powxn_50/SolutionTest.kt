package leetcode.problems.powxn_50

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

internal class SolutionTest {
    @Test
    fun `pow to 0`() {
        assertThat(Solution.pow(100.0, 0)).isEqualTo(1.0)
    }

    @Test
    fun `pow to 1`() {
        assertThat(Solution.pow(100.0, 1)).isEqualTo(100.0)
    }

    @Test
    fun `pow to 2`() {
        assertThat(Solution.pow(100.0, 2)).isEqualTo(10000.0)
    }

    @Test
    fun `pow to -2`() {
        assertThat(Solution.pow(2.0, -2)).isEqualTo(0.25)
        assertThat(Solution.pow(100.0, -2)).isEqualTo(0.0001)
    }
}
