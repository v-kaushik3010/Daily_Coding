// Last updated: 3/17/2026, 11:29:42 AM
class Solution {
    public int minLength(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        int left =0;
        int ans = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right],0)+1);
            if(map.get(nums[right]) == 1){
                sum+=nums[right];
            }
            while(sum>=k){
                ans = Math.min(ans, right-left+1);
                map.put(nums[left], map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    sum-=nums[left];
                }left++;
            }
        }return ans==Integer.MAX_VALUE?-1:ans;
    }
}