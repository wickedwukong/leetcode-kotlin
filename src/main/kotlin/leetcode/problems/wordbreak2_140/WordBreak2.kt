package leetcode.problems.wordbreak2_140

import java.util.LinkedList



class Solution {
    fun brutalForceWordBreak(s: String, wordDict: Set<String>): Set<String> {
        return word_Break(s, wordDict, 0).toSet()
    }

    private fun word_Break(s: String, wordDict: Set<String>, start: Int): List<String> {
        val result = LinkedList<String>()
        if (start == s.length)  {
            result.add("")
            return result
        }

        for (end in start + 1 .. s.length) {
            if (wordDict.contains(s.substring(start, end))) {
                val list = word_Break( s, wordDict, end)
                for (l in list) {
                    result.add(s.substring(start, end) + (if (l == "") "" else " ") + l)
                }
            }
        }

        return result
    }

}
