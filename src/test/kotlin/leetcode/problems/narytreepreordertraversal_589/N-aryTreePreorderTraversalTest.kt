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

    @Test
    fun `parent and 2 level children - sample daa`() {
        assertThat(Solution()
                .preorder(
                        Node(1,
                                listOf(Node(3, listOf(Node(5, emptyList()), Node(6, emptyList()))), Node(2, emptyList()), Node(4, emptyList())))))
                .isEqualTo(listOf(1,3,5,6,2,4))
    }
}
