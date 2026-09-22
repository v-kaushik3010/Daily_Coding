// Last updated: 9/22/2026, 2:53:55 PM
class Solution {
    static final int MOD = 1_000_000_007;

    public int kConcatenationMaxSum(int[] arr, int k) {

        long maxSub = kadane(arr);
        if (k == 1) {
            return (int) (maxSub % MOD);
        }

        long prefixMax = 0, suffixMax = 0;
        long sum = 0, cur = 0;

        // prefix max
        cur = 0;
        for (int x : arr) {
            cur += x;
            prefixMax = Math.max(prefixMax, cur);
        }

        // suffix max
        cur = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            cur += arr[i];
            suffixMax = Math.max(suffixMax, cur);
        }

        // total sum
        for (int x : arr) sum += x;

        long ans;
        if (sum > 0) {
            ans = suffixMax + prefixMax + (k - 2) * sum;
        } else {
            ans = kadaneTwice(arr);
        }

        return (int) (Math.max(ans, 0) % MOD);
    }

    private long kadane(int[] arr) {
        long max = 0, cur = 0;
        for (int x : arr) {
            cur = Math.max(0, cur + x);
            max = Math.max(max, cur);
        }
        return max;
    }

    private long kadaneTwice(int[] arr) {
        long max = 0, cur = 0;
        for (int i = 0; i < 2 * arr.length; i++) {
            cur = Math.max(0, cur + arr[i % arr.length]);
            max = Math.max(max, cur);
        }
        return max;
    }
}
