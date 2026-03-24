// Last updated: 3/24/2026, 11:03:58 AM
1class Solution {
2    public int[][] constructProductMatrix(int[][] grid) {
3        long mod = 12345;
4        long product = 1;
5        int n = grid.length, m = grid[0].length;
6        int size = n*m;
7
8        long[] flatten = new long[size];
9        int idx=0;
10        for(int i= 0 ; i <n;i++){
11            for(int j = 0; j < m ;j++){
12                flatten[idx++] = (long)(grid[i][j]%mod);
13            }
14        }
15        long [] prefix = new long[size];
16        prefix[0] =1; 
17
18        for(int i= 1 ; i <size; i++){
19                prefix[i] = (prefix[i-1] * flatten[i-1])%mod;
20            
21        }
22
23        long [] suf = new long[size];
24        suf[size-1] = 1; 
25
26        for(int i= size-2 ; i >=0;i--){
27                suf[i] = (suf[i+1] * flatten[i+1])%mod;
28        }
29        idx=0;
30        for(int i= 0 ; i < n;i++){
31            for(int j = 0; j < m; j++){
32                grid[i][j] = (int)((prefix[idx] * suf[idx])%mod); 
33                idx++;
34            }
35        }
36        
37        return grid;
38
39    }
40}