class Solution {
    public int findChampion(int n, int[][] edges) {
        int [] indegree = new int[n];
        for(int[] e : edges){
            int u = e[0];
            int v = e[1];

            indegree[v]++;
        }
        int ans = -1;
        for(int i = 0; i < n ; i++){

            if(ans != -1 && indegree[i] == 0) return -1;
            else if (indegree[i] ==0) ans = i;
        }return ans;

    }
}
