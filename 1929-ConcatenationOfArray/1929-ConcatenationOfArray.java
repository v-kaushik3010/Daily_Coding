// Last updated: 9/22/2026, 2:49:56 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        for(int i = 0; i < n; i++){
            ans[i] = ans[i+n] = nums[i];
        }
        return ans;
    }
}