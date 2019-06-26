package leetcode.problems.narytreepreordertraversal_589

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class `N-aryTreePreorderTraversalTest` {

    @Test
    fun `1 node tree has only root value`() {
        assertThat(Solution().preorder(Node(1, emptyList()))).isEqualTo(listOf(1))
    }

    @Test
    fun `parent & one level children`() {
        assertThat(Solution().preorder(Node(1, listOf(Node(2, emptyList()))))).isEqualTo(listOf(1, 2))
        assertThat(Solution().preorder(Node(1, listOf(Node(2, emptyList()))))).isEqualTo(listOf(1, 2))
    }


}
