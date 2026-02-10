class Solution {
    public int solve(int x, int y){
        int count = 1;
        while(x!= y){
            if(x>y) x /=2;
            else y/=2;
            count++;
        }return count;
    }
    public int[] cycleLengthQueries(int n, int[][] queries) {
        int len = queries.length;
        int[] ans = new int[len];
        for(int i = 0;i < len; i++){
            ans[i] = solve(queries[i][0], queries[i][1]);
        }return ans;
    }
}
