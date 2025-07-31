// Last updated: 7/31/2025, 6:04:38 PM
class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int n=piles.size();
        int[] dp=new int[k+1];// k steps dynamic programming;
        for(List<Integer> pile:piles){
            int m=pile.size();
            int[] cum=new int[m+1];
            for(int i=0;i<m;i++) cum[i+1]=cum[i]+pile.get(i);
            int[] curdp=new int[k+1];
            for(int i=0;i<=k;i++){
                for(int j=0;j<=m&& i+j <=k;j++){
                    curdp[i+j]=Math.max(curdp[i+j],dp[i]+cum[j]);
                }
            }
            dp=curdp;
        }
        return dp[k];
    }
}
