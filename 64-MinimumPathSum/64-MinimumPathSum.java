// Last updated: 9/24/2025, 10:33:52 AM
import java.util.Arrays;

class Solution {
public int minPathSum(int[][] grid) {
int m = grid.length;
int n = grid[0].length;
int dp[][] = new int[m][n];

    for (int[] d : dp) {
        Arrays.fill(d, -1);
    }
    return fn(m - 1, n - 1, grid, dp);
}

public int fn(int x, int y, int arr[][], int dp[][]) {
    if (x < 0 || y < 0)
        return Integer.MAX_VALUE;
    if (x == 0 && y == 0)
        return arr[0][0];

    if (dp[x][y] != -1)
        return dp[x][y];

    int up = fn(x - 1, y, arr, dp);
    int left = fn(x, y - 1, arr, dp);

    return dp[x][y] = arr[x][y] + Math.min(up, left);
}
}

