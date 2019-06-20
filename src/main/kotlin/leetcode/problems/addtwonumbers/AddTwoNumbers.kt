package leetcode.problems.addtwonumbers

import java.util.*

class Solution {
    fun addTwoNumbers(l1: LinkedList<Int>, l2: LinkedList<Int>): LinkedList<Int> {
        if (l1.isEmpty()) return l2
        if (l2.isEmpty()) return l1

        val result = LinkedList<Int>()
        result.add(0)

        for ((index, value) in l1.withIndex()) {
            val addition = result.last + value + l2[index]
            result.removeLast()

            if (addition >= 10) {
                result.addLast(addition - 10)
                result.addLast(1)
            } else {
                result.addLast(addition)
                result.addLast(0)
            }
        }

        if (result.last == 0) result.removeLast()

        return result
    }
}
