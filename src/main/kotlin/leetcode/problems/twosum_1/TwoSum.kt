package leetcode.problems.twosum_1

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for ((index, i) in nums.withIndex()) {
            val indexOfTheOtherValue = nums.lastIndexOf(target - i)
            if (indexOfTheOtherValue > -1 && indexOfTheOtherValue != index) {
                return intArrayOf(index, indexOfTheOtherValue)
            }
        }
        return intArrayOf()
    }
}
