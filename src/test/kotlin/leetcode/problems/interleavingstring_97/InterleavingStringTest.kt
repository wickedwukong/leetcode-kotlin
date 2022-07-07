package leetcode.problems.interleavingstring_97

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test


internal class InterleavingStringTest {
    @Test
    fun `empty strings`() {
        assertThat(Solution().isInterleave("", "", "")).isTrue
        assertThat(Solution().isInterleaveLessMemory("", "", "")).isTrue
    }

    @Test
    fun `a true case`() {
        assertThat(Solution().isInterleave(s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac")).isTrue
        assertThat(Solution().isInterleaveLessMemory(s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac")).isTrue
    }

    @Test
    fun `another true case`() {
        assertThat(Solution().isInterleave(s1 = "aabcc", s2 = "dbbca", s3 = "aadbcbbcac")).isTrue
        assertThat(Solution().isInterleaveLessMemory(s1 = "aabcc", s2 = "dbbca", s3 = "aadbcbbcac")).isTrue
    }
    @Test
    fun `another true long case`() {
        assertThat(Solution().isInterleaveLessMemory(s1 = "cabbcaaacacbac", s2 = "acabaabacabcca", s3 = "cacabaabacaabccbabcaaacacbac")).isTrue
    }

    @Test
    fun `a false case`() {
        assertThat(Solution().isInterleave(s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc")).isFalse
        assertThat(Solution().isInterleaveLessMemory(s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc")).isFalse
    }

    @Test
    fun `some simple cases`() {
        assertThat(Solution().isInterleave(s1 = "12", s2 = "34", s3 = "3124")).isTrue()
        assertThat(Solution().isInterleave(s1 = "1", s2 = "34", s3 = "314")).isTrue()
        assertThat(Solution().isInterleave(s1 = "1", s2 = "34", s3 = "341")).isTrue()
    }

    @Test
    fun `all combinations`() {
        val combinations = Solution().combinations("111", "22")

        assertThat(combinations).isEqualTo(
            listOf(
                "11122",
                "11212",
                "11221",
                "12112",
                "12121",
                "12211",
                "21112",
                "21121",
                "21211",
                "22111"
            )
        )
    }

}
