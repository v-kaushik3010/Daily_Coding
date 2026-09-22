// Last updated: 9/22/2026, 2:57:46 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currmax = 0;
        for(int i:nums){
            if(i == 1) currmax++;
            else{
                max = Math.max(max, currmax);
                currmax = 0;
            }
        } max = Math.max(max, currmax);
        return max;
    }
}