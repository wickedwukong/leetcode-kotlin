package leetcode.problems.addtwonumbers

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class AddTwoNumbersTest {

    @Test
    fun `two null lists give null list`() {
        assertThat(Solution().addTwoNumbers(null, null)).isEqualTo(null)
    }

    @Test
    fun `return one list when the other is null`() {
        assertThat(Solution().addTwoNumbers(ListNode(1, null), null)).isEqualTo(ListNode(1, null))
        assertThat(Solution().addTwoNumbers(null, ListNode(2, null))).isEqualTo(ListNode(2, null))
    }

    @Test
    fun `two single digit list`() {
        assertThat(Solution().addTwoNumbers(ListNode(1, null), ListNode(2, null))).isEqualTo(ListNode(3, null))
    }
}
