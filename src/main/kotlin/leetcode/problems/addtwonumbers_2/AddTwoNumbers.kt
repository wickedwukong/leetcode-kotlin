package leetcode.problems.addtwonumbers_2

import java.util.*

class Solution {
    fun addTwoNumbers(l1: LinkedList<Int>, l2: LinkedList<Int>): LinkedList<Int> {
        return if (l1.size >= l2.size) foo(l1, l2) else foo(l2, l1)
    }

    private fun foo(l1: LinkedList<Int>, l2: LinkedList<Int>): LinkedList<Int> {
        if (l1.isEmpty()) return l2
        if (l2.isEmpty()) return l1

        val result = LinkedList<Int>()
        result.add(0)

        for ((index, value) in l1.withIndex()) {

            val addition = if (l2.size >= (index + 1)) {
                result.last + value + l2[index]
            } else {
                result.last + value
            }

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
