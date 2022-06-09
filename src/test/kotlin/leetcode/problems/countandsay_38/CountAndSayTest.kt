package leetcode.problems.countandsay_38

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

internal class CountAndSayTest {
    @Test
    fun `base case 1`() {
        assertThat(Solution().countAndSay(1)).isEqualTo("1")
    }

    @Test
    fun `should say 2`() {
        assertThat(Solution().countAndSay(2)).isEqualTo("11")
    }

    @Test
    fun `should say 3`() {
        assertThat(Solution().countAndSay(3)).isEqualTo("21")
    }

    @Test
    fun `should say 4`() {
        assertThat(Solution().countAndSay(4)).isEqualTo("1211")
    }

    @Test
    fun `say 1`() {
        assertThat(Solution().say(listOf('1'))).isEqualTo("11")
    }

    @Test
    fun `say 11`() {
        assertThat(Solution().say(listOf('1', '1'))).isEqualTo("21")
    }

    @Test
    fun `say 21`() {
        assertThat(Solution().say(listOf('2', '1'))).isEqualTo("1211")
    }

}
