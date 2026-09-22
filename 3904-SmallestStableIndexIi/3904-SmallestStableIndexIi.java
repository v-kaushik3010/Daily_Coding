// Last updated: 9/22/2026, 2:42:00 PM
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int [] max = new int[n];
        int [] min = new int[n];

        int maxx = nums[0];
        for(int  i = 0; i < n ; i++){
            maxx = Math.max(maxx, nums[i]);
            max[i] = maxx;
        }

        int minn = nums[n-1];
        for(int  i = n-1; i >=0 ; i--){
            minn = Math.min(minn, nums[i]);
            min[i] = minn;
        }

        for(int i = 0; i < n ; i++){
            if(max[i] - min[i] <= k) return i;
        }

        return -1;
    }
}