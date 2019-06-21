package leetcode.problems.wordbreak2_140

import java.util.LinkedList



class Solution {
    fun wordBreak(s: String, wordDict: Set<String>): Set<String> {
        return word_Break(s, wordDict, 0).toSet()
    }

    fun word_Break(s: String, wordDict: Set<String>, start: Int): LinkedList<String> {
        val res = LinkedList<String>()
        if (start == s.length) {
            res.add("")
        }
        for (end in start + 1..s.length) {
            if (wordDict.contains(s.substring(start, end))) {
                val list = word_Break(s, wordDict, end)
                for (l in list) {
                    res.add(s.substring(start, end) + (if (l == "") "" else " ") + l)
                }
            }
        }
        return res
    }
}
