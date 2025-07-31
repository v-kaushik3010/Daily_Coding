// Last updated: 7/31/2025, 6:05:00 PM
class Solution {
    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;        
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = dfs(root.left);
        int r = dfs(root.right);

        res = Math.max(res, l + r);

        return 1 + Math.max(l, r);
    }    
}