// Last updated: 9/22/2026, 3:01:37 PM
class Solution {
    public int uniquePathsWithObstacles(int[][] Grid) {
        int m = Grid.length;
        int n = Grid[0].length;

        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++)
            Arrays.fill(dp[i], -1);

        return solve(m, n, Grid, dp, 0, 0);
    }

    public int solve(int m, int n, int[][] Grid, int[][] dp, int i, int j) {

        if (i >= m || j >= n)
            return 0;

        if (Grid[i][j] == 1)
            return 0;

        if (i == m - 1 && j == n - 1)
            return 1;

        if (dp[i][j] != -1)
            return dp[i][j];

        return dp[i][j] = solve(m, n, Grid, dp, i + 1, j) + solve(m, n, Grid, dp, i, j + 1);

    }
}