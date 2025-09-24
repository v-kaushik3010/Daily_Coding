// Last updated: 9/24/2025, 10:33:23 AM
class Solution {

    private int distinct(String s, String t, int[][] dp, int i, int j) {
        // System.out.printf("distinct(%s, %s, _, %d, %d)\n", s, t, i, j);
        if (j == t.length()) {
            return 1;
        }
        if (i >= s.length() || s.length() - i < t.length() - j) {
            return 0;
        }
        if (dp[i][j] != 0) {
            return dp[i][j] > 0 ? dp[i][j] : 0;
        }
        int count = distinct(s, t, dp, i+1, j);
        if (s.charAt(i) == t.charAt(j)) {
            count += distinct(s, t, dp, i+1, j+1);
        }
        dp[i][j] = count > 0 ? count : -1;
        return count;
    }
 
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
        return distinct(s, t, dp, 0, 0);
    }
}