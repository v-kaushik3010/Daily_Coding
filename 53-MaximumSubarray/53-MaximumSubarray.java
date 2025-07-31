// Last updated: 7/31/2025, 6:05:56 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int  max = nums[0], curr = 0;

        for(int i = 0; i < nums.length; i++) {
            curr += nums[i];
            max = curr > max ? curr : max;
            if(curr < 0) curr = 0;
        }

        return max;
    }
}