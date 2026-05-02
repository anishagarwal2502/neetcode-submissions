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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>r=new ArrayList<>();
        postorder(root, r);
        return r;
    }


    void postorder(TreeNode root, List<Integer>r){
        if(null==root) return;

        postorder(root.left, r);
        postorder(root.right, r);
        r.add(root.val);

    }
}