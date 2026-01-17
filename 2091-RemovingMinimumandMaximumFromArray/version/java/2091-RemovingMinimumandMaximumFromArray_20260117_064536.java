// Last updated: 1/17/2026, 6:45:36 AM
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int n = nums.length;
4        if (n == 1) return 1;
5
6        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
7        int minIdx = 0, maxIdx = 0;
8
9        for (int i = 0; i < n; i++) {
10            if (nums[i] < min) {
11                min = nums[i];
12                minIdx = i;
13            }
14            if (nums[i] > max) {
15                max = nums[i];
16                maxIdx = i;
17            }
18        }
19
20        int left = Math.min(minIdx, maxIdx);
21        int right = Math.max(minIdx, maxIdx);
22
23        int option1 = right + 1;               // delete both from front
24        int option2 = n - left;                // delete both from back
25        int option3 = (left + 1) + (n - right); // one from front, one from back
26
27        return Math.min(option1, Math.min(option2, option3));
28    }
29}
30