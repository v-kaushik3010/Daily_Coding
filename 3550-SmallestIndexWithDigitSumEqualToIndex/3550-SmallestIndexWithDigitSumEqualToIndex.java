// Last updated: 9/24/2026, 8:38:00 PM
class Solution {

    public boolean isans(int idx, int digit){
        int sum = 0;
        while(digit>0){
            sum+=digit%10;
            digit /= 10;
            if(sum > idx) return false;
        }
        if(sum == idx) return true;
        return false;
    }
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(isans(i, nums[i])) return i;
        }
        return -1;
    }
}