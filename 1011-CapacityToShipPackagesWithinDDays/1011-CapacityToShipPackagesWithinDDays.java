// Last updated: 10/7/2026, 5:48:10 PM
class Solution {
    public int shipWithinDays(int[] arr, int d) {
        int hi = 0;
        int lo = 0;
        for (int e : arr) {
            hi += e;
            lo = Math.max(lo, e);
        }

        int ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (days(mid, arr) <= d) {
                hi = mid - 1;
                ans = mid;
            } else
                lo = mid + 1;
        }
        return ans;
    }

    public static int days(int mid, int[] arr) {
        int day = 0;
        int cap = mid;
        for (int e : arr) {
            if (e <= cap)
                cap -= e;
            else {
                day++;
                cap = mid - e;
            }
        }
        day++;
        return day;
    }
}