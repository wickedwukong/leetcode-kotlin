package leetcode.problems.permutations_46

internal class Solution {
    fun permute(nums: List<Int>): List<List<Int>> =
        nums.foldIndexed(emptyList()) { index, acc, num ->
            val subList: List<Int> = nums.subList(0, index).plus(nums.subList(index + 1, nums.size))
            val subListPermutations = permute(subList)
            if (subListPermutations.isEmpty()) {
                acc.plus(listOf(listOf(num)))
            } else {
                val fullListPermutations: List<List<Int>> =
                    subListPermutations.map { subListPermutation -> listOf(num) + subListPermutation }
                acc.plus(fullListPermutations)
            }
        }
}
