package leetcode.problems.uniquebinarysearchtrees_96

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

internal class UniqueBinarySearchTreesTest {
    @Test
    fun `should have 1 unique tree for 1 node`() {
        assertThat(Solution().numTrees(1)).isEqualTo(1)
    }

    @Test
    fun `should have 2 unique tree for 2 nodes`() {
        assertThat(Solution().numTrees(2)).isEqualTo(2)
    }

    @Test
    fun `should have 5 unique tree for 3 nodes`() {
        assertThat(Solution().numTrees(3)).isEqualTo(5)
    }
}
