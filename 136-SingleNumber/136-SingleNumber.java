// Last updated: 9/22/2026, 2:59:57 PM
class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i:nums){
            xor^=i;
        }return xor;
    }
}