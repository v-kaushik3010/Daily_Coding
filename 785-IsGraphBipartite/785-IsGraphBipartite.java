// Last updated: 9/22/2026, 2:56:15 PM
class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<BP> q = new LinkedList<>();
        HashMap<Integer, Integer> visited = new HashMap<>();
        for(int i = 0; i < graph.length; i++){
            if(visited.containsKey(i)) continue;
            q.add(new BP(i, 0));

            while(!q.isEmpty()){
                //1.remove
                BP rp = q.poll();
                //2.IGNORE
                if(visited.containsKey(rp.vtx)){
                    if(visited.get(rp.vtx) != rp.dis) return false;
                    continue;
                }
                //3.marked visited
                if(!visited.containsKey(rp.vtx)) visited.put(rp.vtx, rp.dis);
                //4.self work
                //5.add nbrs
                for(int nbrs: graph[rp.vtx]){
                    if(!visited.containsKey(nbrs)) q.add(new BP(nbrs, rp.dis+1));
                }
            }
        }return true;


    }


    class BP{
        int vtx;
        int dis;
        public BP(int vtx, int dis){
            this.vtx = vtx;
            this.dis = dis;

        }
    }
}