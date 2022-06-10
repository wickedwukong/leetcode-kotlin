package multiplystrings_43

import leetcode.problems.multiplystrings_43.Solution
import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat


internal class MultiplyStringsTest {
    @Test
    fun `multiply with 0 `() {
        assertThat(Solution().multiply("0", "3")).isEqualTo("0")
        assertThat(Solution().multiply("0", "0")).isEqualTo("0")
        assertThat(Solution().multiply("1", "0")).isEqualTo("0")
    }

    @Test
    fun `multiply with 10s `() {
        assertThat(Solution().multiply("10", "10")).isEqualTo("100")
    }

    @Test
    fun `multiple 2 single digits`() {
        assertThat(Solution().multiply("2", "3")).isEqualTo("6")
    }

    @Test
    fun `multiple 2 triple digits`() {
        assertThat(Solution().multiply("123", "456")).isEqualTo("56088")
    }

}
