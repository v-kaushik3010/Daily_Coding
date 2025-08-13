// Last updated: 8/13/2025, 10:54:41 AM
import java.util.Arrays;

public class Solution {

    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for (int i = 0; i < k / 2; i++) {
            int r1 = x + i;
            int r2 = x + k - 1 - i;
            for (int j = 0; j < k; j++) {
                int tmp = grid[r1][y + j];
                grid[r1][y + j] = grid[r2][y + j];
                grid[r2][y + j] = tmp;
            }
        }
        return grid;
    }
}