// Last updated: 9/24/2025, 10:33:25 AM
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

    public static void pathSumHelper(TreeNode root,int targetSum,int sum,List<Integer> ans,List<List<Integer>> result)
    {
        if(root == null)return;

        sum =  sum + root.val;
        ans.add(root.val);

        if(root.left == null && root.right == null && sum == targetSum)result.add(new ArrayList<Integer>(ans));
           
        if(root.left != null)pathSumHelper(root.left,targetSum,sum,ans,result);

        if(root.right != null)pathSumHelper(root.right,targetSum,sum,ans,result);

        ans.remove(ans.size()-1);
        sum = sum - root.val;
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) 
    {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        int sum = 0;
        pathSumHelper(root,targetSum,sum,ans,result);
        return result;
    }
}