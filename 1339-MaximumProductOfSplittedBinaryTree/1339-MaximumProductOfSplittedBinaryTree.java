// Last updated: 9/22/2026, 2:52:55 PM
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
    long totalsum = 0; 
    long maxmul = 0;
    static final int mod = 1_000_000_007;
    long total(TreeNode node){
        if(node == null) return 0;
        return node.val+ total(node.left)+ total(node.right); 
    } 
    long dfs(TreeNode node){
        if(node == null) return 0;
        long s = node.val+ dfs(node.left) + dfs(node.right);
        maxmul = Math.max(maxmul, s*(totalsum -s));
        return s;
    }
    public int maxProduct(TreeNode root) {
        totalsum = total(root);
        dfs(root);
        return(int)(maxmul % mod);
    }
}