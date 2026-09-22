// Last updated: 9/22/2026, 3:00:31 PM
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
    static int ans =0;
    public int maxDepth(TreeNode root) {
        if(root == null) return ans;
        else return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}