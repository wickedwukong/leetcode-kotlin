package leetcode.problems.addtwonumbers

import org.assertj.core.api.Assertions.assertThat
import java.util.*
import kotlin.test.Test

class AddTwoNumbersTest {

    @Test
    fun `two empty lists give an empty list`() {
        assertThat(Solution().addTwoNumbers(LinkedList(), LinkedList())).isEqualTo(LinkedList<Int>())
    }

    @Test
    fun `return one list when the other is empty`() {
        assertThat(Solution().addTwoNumbers(LinkedList(listOf(1)), LinkedList())).isEqualTo(LinkedList(listOf(1)))
        assertThat(Solution().addTwoNumbers(LinkedList(), LinkedList(listOf(1)))).isEqualTo(LinkedList(listOf(1)))
    }

    @Test
    fun `two single digit list`() {
        assertThat(Solution().addTwoNumbers(LinkedList(listOf(1)), LinkedList(listOf(2)))).isEqualTo(LinkedList(listOf(3)))
    }

    @Test
    fun `sample data`() {
        assertThat(Solution().addTwoNumbers(LinkedList(listOf(2, 4, 3)), LinkedList(listOf(5, 6, 4)))).isEqualTo(LinkedList(listOf(7, 0, 8)))
    }
}
