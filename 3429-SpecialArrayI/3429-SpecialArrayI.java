// Last updated: 7/31/2025, 6:02:38 PM
class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1) return true;

        int previous = 2; //0 -> even, 1 -> odd
        for(int i = 0; i < nums.length; i++){
            if(nums[i] %2 == previous) return false;
            else{
                previous = nums[i] % 2;
            }

        }
        System.gc();
        return true;
        
    }
}