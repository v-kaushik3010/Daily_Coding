// Last updated: 9/22/2026, 2:46:27 PM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int res = 0;
        for (int x : derived) {
            res ^= x;
        }
        return res == 0;
    }
}