// Last updated: 10/8/2026, 3:32:04 PM
class Solution {
    public int smallestDivisor(int[] arr, int th) {
        int lo = 1;
        int hi = 0;
        for (int e : arr) {
            // lo = Math.min(lo,e);
            hi = Math.max(hi, e);
        }

        int ans = hi;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (sum(mid, arr) <= th) {
                hi = mid - 1;
                ans = mid;
            } else
                lo = mid + 1;
        }
        return ans;
    }

    public static int sum(int mid, int[] arr) {
        int h = 0;
        for (int e : arr) {
           h+=(e+mid-1)/mid;
        }
        return h;
    }
}