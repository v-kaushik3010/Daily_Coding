// Last updated: 7/31/2025, 6:05:59 PM
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        dfs(nums, 0);
        return result;
    }
    public void dfs(int[] nums, int start) {
        if(start == nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int val: nums) {
                list.add(val);
            }
            result.add(list);
            return;
        }

        for(int i = start; i< nums.length; i++) {
            shift(nums, start, i);
            dfs(nums, start+1);
            shift(nums, start, i);
        }
    }

    public void shift(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}