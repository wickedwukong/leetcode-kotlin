package leetcode.problems.zigzagconversion_6

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat


internal class ZigzagConversionTest {
    @Test
    fun `convert for a single letter and a single row`() {
        assertThat(Solution("A", 1).convert()).isEqualTo("A")
    }

    @Test
    fun `convert for 2 letters and a single row`() {
        assertThat(Solution("AB", 1).convert()).isEqualTo("AB")
    }

    @Test
    fun `convert for 2 letters and 2 rows`() {
        assertThat(Solution("AB", 2).convert()).isEqualTo("AB")
    }

    @Test
    fun `convert for 3 letters and 2 rows`() {
        assertThat(Solution("ABC", 2).convert()).isEqualTo("ACB")
    }

    @Test
    fun `convert for multiple letters and multiple rows`() {
        assertThat(Solution("PAYPALISHIRING", 3).convert()).isEqualTo("PAHNAPLSIIGYIR")
    }

}
