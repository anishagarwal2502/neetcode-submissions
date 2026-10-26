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
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        if (null != root)
            q.addLast(root);
        List<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.removeFirst();
                if (i == size - 1)
                    ans.add(curr.val);
                if (null != curr.left)
                    q.addLast(curr.left);
                if (null != curr.right)
                    q.addLast(curr.right);
            }
        }
        return ans;
    }
}
