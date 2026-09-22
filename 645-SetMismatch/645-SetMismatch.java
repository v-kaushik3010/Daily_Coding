// Last updated: 9/22/2026, 2:57:01 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int dup=0;
        int mis=0;

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                dup=nums[i];
            }else{
                set.add(nums[i]);
            }
        }

        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                mis=i;
                break;
            }
        }
            
    return new int[]{dup,mis};
    }
}