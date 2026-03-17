// Last updated: 3/17/2026, 11:29:54 AM
class Solution {
    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
        long[] limit = new long[n];
        for(int i = 0; i < n; i++) limit[i] = (long)1e18;
        limit[0]=0;
        for(int[] e : restrictions){
            int idx = e[0];
            int maxval = e[1];
            limit[idx] = Math.min(limit[idx],maxval);
        }
        for(int i = 1; i <n; i++){
            limit[i] = Math.min(limit[i],limit[i-1]+diff[i-1]);
        }
        for(int i = n-2; i >=0; i--){
            limit[i] = Math.min(limit[i],limit[i+1]+diff[i]);
        }
        long ans = 0;
        for(long i : limit){
            ans = Math.max(ans,i);
        }
        return (int)ans;
    }
}