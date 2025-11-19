// Last updated: 11/19/2025, 12:33:57 PM
class Solution {
    public int longestCycle(int[] edges) {
        int n = edges.length;
        int[] in = new int[n];

        // Step 1: Build indegree array
        for (int i = 0; i < n; i++) {
            if (edges[i] != -1) {
                in[edges[i]]++;
            }
        }

        // Step 2: Topological removal of non-cycle nodes
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (in[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int e = q.poll();
            visited[e] = true;

            if (edges[e] != -1) {
                in[edges[e]]--;
                if (in[edges[e]] == 0) {
                    q.add(edges[e]);
                }
            }
        }

        // Step 3: Find cycles among unvisited nodes
        int ans = -1;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int curr = i;
                int count = 0;

                // Traverse cycle
                while (!visited[curr]) {
                    visited[curr] = true;
                    curr = edges[curr];
                    count++;
                }

                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}
