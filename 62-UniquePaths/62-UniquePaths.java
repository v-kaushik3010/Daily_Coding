// Last updated: 9/22/2026, 3:01:42 PM
class Solution {
    
    // public int helper(int m, int n , int[][] dp){
    //     if(m == 1|| n ==1) return 1;

    //     if(dp[m][n] != 0) return dp[m][n];
        
    //     return dp[m][n] = helper(m-1,n, dp) + helper(m, n-1, dp);

    // }


    // public int uniquePaths(int m, int n) {
    //    int [][] dp = new int[m+1][n+1];
    //     return helper(m, n , dp);
    // }



    //tabulation

    public int uniquePaths(int m, int n) {
       int [][] dp = new int[m][n];
       Arrays.fill(dp[0], 1);
       for(int j = 1 ; j < m; j++) dp[j][0] = 1;

        for(int i = 1; i < m; i ++){

            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];

            }
        }

        // for(int i = 0; i < m; i ++){

        //     for(int j = 0; j < n; j++){
        //         System.out.print(dp[i][j] +" ");

        //     }System.out.println();
        // }

        return dp[m-1][n-1];
    }
}