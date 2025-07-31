// Last updated: 7/31/2025, 6:06:31 PM
import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array first
        int closestSum = Integer.MAX_VALUE; // To store the closest sum
        int minDiff = Integer.MAX_VALUE; // To track the smallest difference

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(target - sum);

                if (diff < minDiff) {
                    minDiff = diff;
                    closestSum = sum;
                }

                // Adjust pointers
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }
}
