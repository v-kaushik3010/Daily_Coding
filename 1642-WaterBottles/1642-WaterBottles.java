// Last updated: 10/3/2025, 11:21:18 AM
class Solution {
    public int numWaterBottles(int b, int n) {
        return b + (b - 1) / (n - 1);
    }
}