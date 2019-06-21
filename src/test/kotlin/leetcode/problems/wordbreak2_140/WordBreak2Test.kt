package leetcode.problems.wordbreak2_140

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test


class WordBreak2Test {
    @Test
    fun `empty sentence if no word is found in dictionary`() {
        assertThat(Solution().brutalForceWordBreak("cat", setOf("dog"))).isEqualTo(setOf<String>())
    }

    @Test
    fun `sample data`() {
        assertThat(Solution().brutalForceWordBreak("catsanddog", setOf("cat", "cats", "and", "sand", "dog"))).isEqualTo(setOf("cats and dog", "cat sand dog"))
        assertThat(Solution().brutalForceWordBreak("pineapplepenapple", setOf("apple", "pen", "applepen", "pine", "pineapple")))
                .isEqualTo(setOf("pine apple pen apple",
                        "pineapple pen apple",
                        "pine applepen apple"))
    }
}
