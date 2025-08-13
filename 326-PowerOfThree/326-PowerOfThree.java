// Last updated: 8/13/2025, 11:39:50 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
        while(n%3 == 0){
            n /= 3;
        }
        if(n == 1){
            return true;
        }
        return false;
    }
}