// Last updated: 9/22/2026, 2:42:01 PM
class Solution {
    public int minimumSwaps(int[] nums) {
        int l=0, r = nums.length -1, op = 0;
        while(l<r){
            while(l<r && nums[l] != 0) l++;
            while(l<r && nums[r] == 0) r--;
            if(l<r){
                nums[l++] = nums[r];
                nums[r--] = 0;
                op++;
            }
        }return op;
    }
}