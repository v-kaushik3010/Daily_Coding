// Last updated: 9/22/2026, 2:54:47 PM
public class Solution {
    public int findJudge(int n, int[][] trust) {
        // Special case: only one person, no trust relations
        if (trust.length == 0 && n == 1) return 1;

        int[] indegree = new int[n + 1];
        int[] outdegree = new int[n + 1];

        // Count trust relationships
        for (int[] t : trust) {
            int a = t[0];
            int b = t[1];
            outdegree[a]++; // person a trusts someone
            indegree[b]++;  // person b is trusted by someone
        }

        // Find the person who is trusted by n-1 and trusts nobody
        for (int i = 1; i <= n; i++) {
            if (indegree[i] == n - 1 && outdegree[i] == 0) {
                return i;
            }
        }

        return -1; // no judge found
    }
}
