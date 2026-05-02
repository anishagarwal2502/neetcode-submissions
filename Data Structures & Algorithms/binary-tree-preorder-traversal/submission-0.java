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
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> r = new ArrayList<>();
        preorder(root,r);
        return r;
    }

    void preorder(TreeNode root, List<Integer> r) {

        if(root==null){
            return;
        }

        r.add(root.val);
        preorder(root.left,r);
        preorder(root.right,r);
    }
}