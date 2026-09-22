// Last updated: 9/22/2026, 2:57:41 PM
class Solution {
    public boolean predictTheWinner(int[] nums) {
        return Check(nums,0 , nums.length-1) >= 0;
    }
    public static int Check(int[] nums, int start, int end){
        if(start == end) return nums[start];

        int first =nums[start] -  Check(nums, start +1, end);
        int last = nums[end] - Check(nums, start, end -1);

        return Math.max(first, last);
    }
}