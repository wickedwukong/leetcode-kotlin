package leetcode.problems.interleavingstring_97

class Solution {
    fun isInterleave(s1: String, s2: String, s3: String): Boolean {
        return combinations(s1, s2).contains(s3)
    }

    fun combinations(s1: String, s2: String): List<String> {
        return allCombinations(s1, 0, s2, 0, "", mutableListOf())
    }

    private fun allCombinations(
        s1: String,
        i: Int,
        s2: String,
        j: Int,
        currentCombination: String,
        combinations: MutableList<String>
    ): List<String> {

        if (i == s1.length && j == s2.length) {
            combinations.add(currentCombination)
        }

        if (i < s1.length) {
            allCombinations(s1, i + 1, s2, j, currentCombination + s1[i], combinations)
        }

        if (j < s2.length) {
            allCombinations(s1, i, s2, j + 1, currentCombination + s2[j], combinations)
        }

        return combinations
    }
}
