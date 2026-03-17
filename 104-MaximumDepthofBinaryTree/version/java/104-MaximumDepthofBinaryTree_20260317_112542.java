// Last updated: 3/17/2026, 11:25:42 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int ans =0;
18    public int maxDepth(TreeNode root) {
19        
20        helper(root,1);
21        return ans;
22    }
23    public  void helper(TreeNode root,int depth){
24        if (root == null) return;
25        ans = Math.max(depth,ans);
26        helper(root.left, depth+1);
27        helper(root.right, depth+1);
28    }
29}