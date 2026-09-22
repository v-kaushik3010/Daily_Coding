// Last updated: 9/22/2026, 2:48:41 PM
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
