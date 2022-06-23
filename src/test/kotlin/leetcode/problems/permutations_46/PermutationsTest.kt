package leetcode.problems.permutations_46

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

internal class PermutationsTest {
    @Test
    fun `single element set`() {
        assertThat(Solution().permute(listOf(1))).isEqualTo(listOf(listOf(1)))
    }

    @Test
    fun `two element set`() {
        assertThat(Solution().permute(listOf(0, 1))).isEqualTo(listOf(listOf(0, 1), listOf(1, 0)))
    }

    @Test
    fun `three element set`() {
        assertThat(Solution().permute(listOf(1,2,3))).isEqualTo(listOf(
            listOf(1,2,3),
            listOf(1,3,2),
            listOf(2,1,3),
            listOf(2,3,1),
            listOf(3,1,2),
            listOf(3,2,1)
        ))
    }
}
