// Last updated: 8/13/2025, 11:40:12 AM
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
    private int i=0,p=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,Integer.MIN_VALUE);       
    }
    private TreeNode build(int[] preOrder,int []inOrder,int stop){
            if(p>=preOrder.length){
                return null;
            }
            if(inOrder[i]==stop){
                i++;
                return null;
            }
            TreeNode node=new TreeNode(preOrder[p++]);
            node.left=build(preOrder,inOrder,node.val);
            node.right=build(preOrder,inOrder,stop);
            return node;
    }
}