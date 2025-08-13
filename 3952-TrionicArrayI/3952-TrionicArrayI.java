// Last updated: 8/13/2025, 10:54:43 AM
class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;

        for(int p =1; p <= n-3; p++){
            if(!isincreasing(nums, 0, p))  continue;            
        

        for(int q = p+1; q <= n-2; q++){
            if(!isdecreasing(nums,p , q)){
            continue;}
        
            if(isincreasing(nums, q, n-1)) {
                return true;
            }
        }
    }return false;
    }
    public boolean isincreasing(int[] nums, int i, int j){
        for(int k = i+1; k<=j; k++){
            if(nums[k] <= nums[k-1]) return false;
            }return true;
    }
    
    public boolean isdecreasing(int[] nums, int i, int j){
        for(int k = i+1; k<= j; k++){
            if(nums[k] >= nums[k-1]) return false;
        }return true;
    }
}