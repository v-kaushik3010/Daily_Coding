// Last updated: 9/22/2026, 2:57:14 PM
public class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        int maxLength = 0;
        
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - nums[j] > 1) {
                j++;
            }
            if (nums[i] - nums[j] == 1) {
                maxLength = Math.max(maxLength, i - j + 1);
            }
        }
        return maxLength;
    }
}