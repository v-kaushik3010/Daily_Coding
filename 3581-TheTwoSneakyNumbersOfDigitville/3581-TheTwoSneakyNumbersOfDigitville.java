// Last updated: 10/31/2025, 3:19:40 PM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        int [] ans = new int[2];
        boolean [] seen = new boolean[nums.length-2];
        int idx = 0;

        for(int num : nums){
            if(seen[num]){
                ans[idx++] = num;
                if(idx==2) break;
            }else seen[num] = true;
        }
        return ans;
    }
}