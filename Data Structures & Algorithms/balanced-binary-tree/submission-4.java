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
    boolean isBalanced;
    public boolean isBalanced(TreeNode root) {
        isBalanced = true;
        isBalancedHelper(root);
        return isBalanced;
    }

    public int isBalancedHelper(TreeNode root) {
        if (root == null || !isBalanced)
            return -1;

        int left = 1 + isBalancedHelper(root.left);
        int right = 1 + isBalancedHelper(root.right);
        isBalanced = isBalanced && Math.abs(left - right) <= 1;
        return Math.max(left, right);
    }
}
