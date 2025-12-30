// Last updated: 12/30/2025, 10:26:11 AM
1public class Solution {
2    public int findJudge(int n, int[][] trust) {
3        // Special case: only one person, no trust relations
4        if (trust.length == 0 && n == 1) return 1;
5
6        int[] indegree = new int[n + 1];
7        int[] outdegree = new int[n + 1];
8
9        // Count trust relationships
10        for (int[] t : trust) {
11            int a = t[0];
12            int b = t[1];
13            outdegree[a]++; // person a trusts someone
14            indegree[b]++;  // person b is trusted by someone
15        }
16
17        // Find the person who is trusted by n-1 and trusts nobody
18        for (int i = 1; i <= n; i++) {
19            if (indegree[i] == n - 1 && outdegree[i] == 0) {
20                return i;
21            }
22        }
23
24        return -1; // no judge found
25    }
26}
27