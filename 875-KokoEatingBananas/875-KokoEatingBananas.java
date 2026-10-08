// Last updated: 10/8/2026, 3:33:02 PM
class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int lo = 1;
        int hi = 0;
        for (int e : arr) {
            // lo = Math.min(lo,e);
            hi = Math.max(hi, e);
        }

        int ans = hi;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (hours(mid, arr) <= h) {
                hi = mid - 1;
                ans = mid;
            } else
                lo = mid + 1;
        }
        return ans;
    }

    public static long hours(int mid, int[] arr) {
        long h = 0;
        long cap = mid;
        for (int e : arr) {
            if (e % cap == 0)
                h += e / cap;
            else
                h += e / cap + 1;
        }
        return h;
    }
}