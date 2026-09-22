// Last updated: 9/22/2026, 2:59:08 PM
class Solution {
    public int helper( int i,int j, int[] arr, int[] dp) {
        if (i >= j)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int take = arr[i] + helper(i + 2,j, arr, dp);
        int skip = helper(i + 1,j, arr, dp);
        return dp[i] = Math.max(take, skip);
    }

    public int rob(int[] arr) {
        int n = arr.length;
        if(n==1) return arr[0];
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        int[] dp2 = new int[arr.length];
        Arrays.fill(dp2, -1);
        return Math.max(helper(0,n-1, arr, dp), helper(1,n, arr, dp2));
    }
}