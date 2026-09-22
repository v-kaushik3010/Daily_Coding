// Last updated: 9/22/2026, 2:51:14 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans= 0;
        for(int i = 0; i < accounts.length; i++){
            int currsum = 0;
            for(int j = 0; j < accounts[0].length; j++){
                currsum += accounts[i][j];
            }
            ans = Math.max(ans, currsum);
        }return ans;
    }
}