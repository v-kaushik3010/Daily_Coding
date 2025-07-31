// Last updated: 7/31/2025, 6:05:34 PM
class Solution {
    int sum =0;
    int k =0;
    public int sumNumbers(TreeNode root) {
        if(root==null)
        {
            return k;
        }
        sum = sum*10+root.val;
        if(root.right==null&&root.left==null)
        {
            k=k+sum;
        }
        sumNumbers(root.left);
        sumNumbers(root.right);
        sum=sum/10;
        return k;
    }
}