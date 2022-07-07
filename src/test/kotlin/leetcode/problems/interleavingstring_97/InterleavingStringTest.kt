package leetcode.problems.interleavingstring_97

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test


internal class InterleavingStringTest {
    @Test
    fun `empty strings`() {
        assertThat(Solution().isInterleave("", "", "")).isTrue
    }

    @Test
    fun `a true case`() {
        assertThat(Solution().isInterleave(s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac")).isTrue
    }

    @Test
    fun `another true case`() {
        assertThat(Solution().isInterleave(s1 = "aabcc", s2 = "dbbca", s3 = "aadbcbbcac")).isTrue
    }

    @Test
    fun `a false case`() {
        assertThat(Solution().isInterleave(s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc")).isFalse
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
