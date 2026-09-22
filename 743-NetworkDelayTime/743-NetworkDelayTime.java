// Last updated: 9/22/2026, 2:56:33 PM
import java.util.*;

class Solution {

    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public int networkDelayTime(int[][] times, int n, int k) {

        // Step 0: Build Graph (Directed)
        map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new HashMap<>());
        }

        for (int[] t : times) {
            map.get(t[0]).put(t[1], t[2]); // directed edge
        }

        return dijkstra(n, k);
    }

    class DijkstraPair {
        int vtx;
        int cost;

        public DijkstraPair(int vtx, int cost) {
            this.vtx = vtx;
            this.cost = cost;
        }
    }

    private int dijkstra(int n, int src) {

        PriorityQueue<DijkstraPair> pq =
                new PriorityQueue<>((a, b) -> a.cost - b.cost);

        HashSet<Integer> visited = new HashSet<>();

        // start from source k
        pq.add(new DijkstraPair(src, 0));

        int maxTime = 0;

        while (!pq.isEmpty()) {

            // 1️⃣ REMOVE
            DijkstraPair rp = pq.poll();

            // 2️⃣ IGNORE VISITED
            if (visited.contains(rp.vtx)) {
                continue;
            }

            // 3️⃣ MARK VISITED
            visited.add(rp.vtx);

            // 4️⃣ SELF WORK
            maxTime = Math.max(maxTime, rp.cost);

            // 5️⃣ ADD NEIGHBOURS
            for (int nbr : map.get(rp.vtx).keySet()) {
                if (!visited.contains(nbr)) {
                    int edgeCost = map.get(rp.vtx).get(nbr);
                    pq.add(new DijkstraPair(nbr, rp.cost + edgeCost));
                }
            }
        }

        // If all nodes are not reached
        return visited.size() == n ? maxTime : -1;
    }
}
