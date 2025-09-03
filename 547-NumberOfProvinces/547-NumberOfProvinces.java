// Last updated: 9/3/2025, 12:15:14 PM
class Solution {

    public static void helper(List<List<Integer>> list , int node,int vis[])
    {
       vis[node] = 1;
       for(int nval : list.get(node)){
            if(nval != node && vis[nval] == 0)helper(list,nval,vis);
       }
    }

    public int findCircleNum(int[][] graph) {
        int n = graph.length;
        int vis[] = new int[n];

        //conversion 
        List<List<Integer>> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            list.add(new ArrayList<>());

            for(int j = 0;j<n;j++){
                if(graph[i][j]  == 1) list.get(i).add(j);
            }} 

        int count = 0;
        for(int i = 0;i<n;i++){
            if(vis[i] == 0){
                count++;
                helper(list,i,vis);
            }
        }

        return count;
    }
}