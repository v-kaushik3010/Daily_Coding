// Last updated: 9/22/2026, 2:55:04 PM
class Solution {
    public int sol(int n, int[] dp){
        if(n == 0) return dp[0] = 0;
        if(n==1) return dp[1] = 1;
        if(dp[n] != 0) return dp[n];
        else return dp[n] = sol(n-1, dp) +sol(n-2, dp);
    }


    // public int fib(int n) {
    //     int [] dp = new int[n+1];
    //     return sol(n, dp);

    // }


    //Tabulation or bottom up dp or iterative dp
    public int fib(int n) {
      if(n == 0) return 0;
        if(n==1) return 1;
        int [] dp = new int[n+1];
        dp[0] = 0; dp[1] = 1;
        
        
        for(int i = 2; i <= n ; i++)
               dp[i] = dp[i-1]+ dp[i-2];
               
        return dp[n];
    }
}