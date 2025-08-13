// Last updated: 8/13/2025, 11:39:30 AM
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
    // 0 - no camera , 1 - has camera , 2 - not needed
    // 2 if node is null or any one of it's child is covered
    int ans =0;
    public int minCameraCover(TreeNode root) {
        if(helper(root) == 0) ans++; // if root's both child has no camera i.e. 0
        return ans;
    }
    public int helper(TreeNode node ){
        if(node == null) return 2;// not needed
        int l = helper(node.left);
        int r = helper(node.right);
        if(l == 2 && r ==2) return 0; 
        else if(l ==0 || r ==0) { //(0,1) (1,0) (2,0)(0,2) (0,0)
            ans++;
            return 1;
        }else return 2; //(1,1) (1,2) (2,1) i.e.  not needed

    }
}