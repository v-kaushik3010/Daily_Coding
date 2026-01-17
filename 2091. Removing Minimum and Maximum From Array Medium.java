class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n == 1) return 1;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minIdx = 0, maxIdx = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIdx = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
        }

        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);

        int option1 = right + 1;               // delete both from front
        int option2 = n - left;                // delete both from back
        int option3 = (left + 1) + (n - right); // one from front, one from back

        return Math.min(option1, Math.min(option2, option3));
    }
}
