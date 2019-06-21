package leetcode.problems.wordbreak2_140

import java.util.LinkedList
import javax.swing.UIManager.put
import java.util.HashMap





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

    fun wordBreak(s: String, wordDict: Set<String>): List<String> {
        return word_Break2(s, wordDict, 0)
    }

    var map = HashMap<Int, List<String>>()

    fun word_Break2(s: String, wordDict: Set<String>, start: Int): List<String> {
        if (map.containsKey(start)) {
            return map[start]!!
        }
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
        map[start] = res
        return res
    }

}
