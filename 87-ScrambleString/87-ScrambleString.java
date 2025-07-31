// Last updated: 7/31/2025, 6:05:41 PM
class Solution {
    public boolean isScramble(String s1, String s2) {
        int n = s1.length();
        boolean memo[][][] = new boolean[n+1][n][n];
        for (int i = 0; i < n; i++){
            for(int j = 0; j<n; j++){
                memo[1][i][j] = s1.charAt(i) == s2.charAt(j);
            }
        }

        for (int length = 2; length <= n; length++){
            for(int i = 0; i < n+1-length; i++ ){
                for (int j = 0; j < n+1-length; j++){
                    for ( int newLength = 1; newLength < length; newLength++){
                        boolean dp1[] = memo[newLength][i];
                        boolean dp2[] = memo[length - newLength][i + newLength];

                        memo[length][i][j] |= dp1[j] && dp2[j + newLength];
                        memo[length][i][j] |= dp1[j + length - newLength] && dp2[j]; 
                    }
                }
            }
        }
        return memo[n][0][0];
    }
}