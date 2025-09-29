// Last updated: 9/29/2025, 1:39:26 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}