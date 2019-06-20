package leetcode.problems.wordbreak2_140

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test


class WordBreak2Test {
    @Test
    fun `empty sentence if no word is found in dictionary`() {
        assertThat(Solution().wordBreak("cat", listOf("dog"))).isEqualTo(emptyList<String>())
    }
}
