/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // when both trees are null
        if(p == null && q == null) return true;
        // when any one tree is null and another not
        if(p == null || q == null) return false;
        // when values of both trees are not same
        if(p.val != q.val) return false;

        // when left and right of both trees are same
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}