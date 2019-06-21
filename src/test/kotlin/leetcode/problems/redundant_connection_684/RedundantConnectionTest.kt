package leetcode.problems.redundant_connection_684

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test


class RedundantConnectionTest {
    @Test
    fun `empty sentence if no word is found in dictionary`() {
        assertThat(Solution().findRedundantConnection(arrayOf(intArrayOf()))).isEqualTo(intArrayOf())
    }
}
