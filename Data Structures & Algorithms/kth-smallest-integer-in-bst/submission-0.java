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

    int ans, idx;
    public int kthSmallest(TreeNode root, int k) {
        ans = -1;
        idx = 0;
        kthSmallestHelper(root, k);
        return ans;
    }

    void kthSmallestHelper(TreeNode root, int k){
        if(root==null) return;
        kthSmallestHelper(root.left, k);
        if(++idx == k) ans = root.val;
        kthSmallestHelper(root.right, k);
    }
}
