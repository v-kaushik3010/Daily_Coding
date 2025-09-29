// Last updated: 9/29/2025, 1:39:16 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int counter = num / 2;
        for (int i = 2; i <= counter; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
}