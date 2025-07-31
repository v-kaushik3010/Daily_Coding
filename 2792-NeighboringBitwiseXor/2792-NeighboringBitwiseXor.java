// Last updated: 7/31/2025, 6:03:04 PM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int res = 0;
        for (int x : derived) {
            res ^= x;
        }
        return res == 0;
    }
}