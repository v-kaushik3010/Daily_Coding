// Last updated: 9/22/2026, 2:53:08 PM
class Solution {
    public int minInsertions(String s) {
        String ss = new StringBuilder(s).reverse().toString();
        int n = s.length();
        int [] dp = new int [s.length()];
        int longest = 0;
        for(char c : s.toCharArray()){
            int curr =0;
            for(int i = 0; i < n ; i++){
                if(curr < dp[i])
                curr= dp[i];
                else if(c == ss.charAt(i)){
                    //curr++;
                    dp[i] = curr+1;
                    longest =Math.max(longest, curr+1);
                }
            }
        }
        return n- longest;

    }
}