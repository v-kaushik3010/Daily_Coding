// Last updated: 9/22/2026, 2:50:24 PM
class Solution {
    public int findCenter(int[][] e) {
        int n = e.length+1;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0 ; i <= n ; i++ ) graph.add(new ArrayList<>());

        int [] degree= new int[n+1];
        for(int[] edge: e){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(u).add(u);

            degree[u]++;
            degree[v]++;

        }
        for(int i =0; i <= n ; i++){
            if(degree[i] == n-1){
                return i;
            }
        }return -1;
    }
}