// Last updated: 8/14/2025, 9:16:20 PM
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
    int max =1;
    public int widthOfBinaryTree(TreeNode root) {
        dfs(root,0,0,new ArrayList<>());
        return max;
    }
    public void dfs(TreeNode root , int level , int index , List<Integer> starts){
        if(root==null) return;
        if(starts.size() ==level){
            starts.add(index);
        }else{
            int leftMostIdx = starts.get(level);
            max = Math.max(max,index - leftMostIdx +1);
        }
        dfs(root.left, level +1 , index + index , starts);
        dfs(root.right, level +1 , index + index +1  , starts); 

    }
}
