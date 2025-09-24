// Last updated: 9/24/2025, 10:33:42 AM
class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        List<TreeNode>[][] memo = new ArrayList[n + 2][n + 2];
        return build(1, n, memo);
    }

    private List<TreeNode> build(int lo, int hi, List<TreeNode>[][] memo) {
        if (lo > hi) {
            List<TreeNode> base = new ArrayList<>();
            base.add(null);
            return base;
        }
        if (memo[lo][hi] != null) return memo[lo][hi];

        List<TreeNode> res = new ArrayList<>();
        for (int rootVal = lo; rootVal <= hi; rootVal++) {
            List<TreeNode> lefts  = build(lo, rootVal - 1, memo);
            List<TreeNode> rights = build(rootVal + 1, hi, memo);
            for (TreeNode L : lefts) {
                for (TreeNode R : rights) {
                    TreeNode root = new TreeNode(rootVal);
                    root.left = L;
                    root.right = R;
                    res.add(root);
                }
            }
        }
        return memo[lo][hi] = res;
    }
}