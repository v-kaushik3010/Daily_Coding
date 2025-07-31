// Last updated: 7/31/2025, 6:03:43 PM
class Solution {
    public boolean divideArray(int[] nums) {
     Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            if(nums[i]!=nums[i+1]){
                return false;
            }
        }
     return true;
}
}
