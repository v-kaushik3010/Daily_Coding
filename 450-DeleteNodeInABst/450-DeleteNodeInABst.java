// Last updated: 8/13/2025, 11:39:46 AM
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

        public TreeNode deleteNode(TreeNode root, int key) {
            if (root == null) return null;

            if (key < root.val) {
                root.left = deleteNode(root.left, key);
            } else if (key > root.val) {
                root.right = deleteNode(root.right, key);
            } else {
                // Node to delete found

                // Case 1 & 2: Node has 0 or 1 child
                if (root.left == null) return root.right;
                if (root.right == null) return root.left;

                // Case 3: Node has 2 children
                int maxVal = findMax(root.left);  // Using predecessor
                root.val = maxVal;
                root.left = deleteNode(root.left, maxVal);  // Delete the predecessor
            }

            return root;
        }

        private int findMax(TreeNode root) {
            while (root.right != null) {
                root = root.right;
            }
            return root.val;
        }
    }
