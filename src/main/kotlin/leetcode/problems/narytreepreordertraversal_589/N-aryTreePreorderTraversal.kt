package leetcode.problems.narytreepreordertraversal_589

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

data class Node(val value: Int, val children: List<Node>)

class Solution {
    fun preorder(root: Node): List<Int> {
        return emptyList()
    }
}
