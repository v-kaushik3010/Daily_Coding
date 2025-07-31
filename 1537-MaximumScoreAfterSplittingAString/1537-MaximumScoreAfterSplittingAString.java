// Last updated: 7/31/2025, 6:04:24 PM
public class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int rz = 0, ro = 0, lz = 0, lo = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                rz++;
            } else {
                ro++;
            }
        }
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                lz++;
                rz--;
            } else {
                ro--;
                lo++;
            }
            mx = Math.max(mx, lz + ro);
        }

        return mx;
    }
}