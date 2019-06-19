package leetcode.problems.addtwonumbers

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

data class ListNode(var value: Int, var next: ListNode? = null) : Iterator<Int> {
    override fun hasNext(): Boolean {
        return next != null
    }

    override fun next(): Int {
        return next?.value ?: throw NoSuchElementException()
    }
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null) return l2

        if (l2 == null) return l1


        val result = ListNode(0, null)
        var tail: ListNode = result
        var t = 0

        for (i in l1) {
            val value = t + i + l2.value

            if (value >= 10) {
                tail.value = value - 10
                t = 1
            } else {
                tail.value =  value
                t = 0
            }

            tail = tail.next!!
        }

        return result
    }
}
