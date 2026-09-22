// Last updated: 9/22/2026, 2:56:26 PM
class Solution {
    // public int help(int i, int[] cost, int [] dp){
    //     if(i >= cost.length) return 0;

    //     if(dp[i] != -1) return dp[i];
    //     return dp[i] = cost[i] + Math.min(help(i+1,cost, dp), help(i+2, cost,dp));
    //}

    // public int minCostClimbingStairs(int[] cost) {
    //     int [] dp = new int[cost.length+1];
    //     Arrays.fill(dp, -1);
    //     return Math.min(help(0, cost, dp), help(1, cost, dp));
    // }

    //tabulation

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[cost.length + 1];
      

        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        return Math.min(dp[n - 1], dp[n - 2]);
    }
}