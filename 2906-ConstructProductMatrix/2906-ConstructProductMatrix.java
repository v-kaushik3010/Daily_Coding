// Last updated: 9/22/2026, 2:45:55 PM
class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        long mod = 12345;
        long product = 1;
        int n = grid.length, m = grid[0].length;
        int size = n*m;

        long[] flatten = new long[size];
        int idx=0;
        for(int i= 0 ; i <n;i++){
            for(int j = 0; j < m ;j++){
                flatten[idx++] = (long)(grid[i][j]%mod);
            }
        }
        long [] prefix = new long[size];
        prefix[0] =1; 

        for(int i= 1 ; i <size; i++){
                prefix[i] = (prefix[i-1] * flatten[i-1])%mod;
            
        }

        long [] suf = new long[size];
        suf[size-1] = 1; 

        for(int i= size-2 ; i >=0;i--){
                suf[i] = (suf[i+1] * flatten[i+1])%mod;
        }
        idx=0;
        for(int i= 0 ; i < n;i++){
            for(int j = 0; j < m; j++){
                grid[i][j] = (int)((prefix[idx] * suf[idx])%mod); 
                idx++;
            }
        }
        
        return grid;

    }
}