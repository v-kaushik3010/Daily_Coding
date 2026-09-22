// Last updated: 9/22/2026, 3:01:45 PM
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int g = n-1;
        for(int i = n-2; i>=0; i--){
            if(i + nums[i] >= g) g = i;
        }
        if(g==0) return true;
        else return false;
    }
}