// Last updated: 9/22/2026, 3:01:26 PM
class Solution {
    public int[] dp= new int [46];

    public int climbStairs(int n) {
          if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (dp[n] != 0)
            return dp[n];

        return dp[n] = climbStairs(n - 1) + climbStairs(n - 2);
    }

}