// Last updated: 9/22/2026, 2:51:48 PM
class Solution {
    public int numWaterBottles(int b, int n) {
        return b + (b - 1) / (n - 1);
    }
}