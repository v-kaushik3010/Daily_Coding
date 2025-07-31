// Last updated: 7/31/2025, 6:06:32 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // Sort the array to apply two-pointer technique
        Arrays.sort(nums);

        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements to avoid repeated triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;  // Second pointer
            int k = nums.length - 1;  // Third pointer

            // Two-pointer approach to find triplets
            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    // If the sum is greater than 0, move the `k` pointer to the left
                    k--;
                } else if (total < 0) {
                    // If the sum is less than 0, move the `j` pointer to the right
                    j++;
                } else {
                    // If the sum is 0, add the triplet to the result list
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    // Skip duplicates for the second number
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicates for the third number
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return res;
    }
}
