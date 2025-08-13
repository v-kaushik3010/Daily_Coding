// Last updated: 8/13/2025, 11:39:24 AM
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

        public int maxSumBST(TreeNode root) {
            return validateBST(root).ans;
        }

        private BstPair validateBST(TreeNode root) {
            if (root == null) {
                return new BstPair(); // An empty tree is a BST with sum 0
            }

            BstPair lbp = validateBST(root.left);
            BstPair rbp = validateBST(root.right);

            BstPair sbp = new BstPair();
            sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));
            sbp.max = Math.max(root.val, Math.max(lbp.max, rbp.max));
            sbp.sum = lbp.sum + rbp.sum + root.val;

            // Check if the current tree is a valid BST
            sbp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;

            if (sbp.isbst) {
                sbp.ans = Math.max(lbp.ans, Math.max(rbp.ans, sbp.sum));
            } else {
                sbp.ans = Math.max(lbp.ans, rbp.ans);
                sbp.sum = 0; // reset sum as this subtree is not a BST
            }

            return sbp;
        }

        class BstPair {
            boolean isbst = true;
            long max = Long.MIN_VALUE;
            long min = Long.MAX_VALUE;
            int sum = 0;  // sum of the current subtree
            int ans = 0;  // max sum of all BSTs seen so far
        }
    }