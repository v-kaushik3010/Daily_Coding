// Last updated: 8/13/2025, 11:39:56 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 &&(n & (n -1)) == 0;
    }

    // class Solution {
    // public boolean isPowerOfTwo(int n) {
    //     return n > 0 && Integer.bitCount(n) == 1;
    // }

//     Counting the number of 1 bits and checking if it equals 1 confirms the number is a power of two.
// If more than one 1 bit exists, the number cannot be a power of two.
}
