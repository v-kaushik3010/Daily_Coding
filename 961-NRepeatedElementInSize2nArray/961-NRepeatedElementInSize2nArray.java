// Last updated: 9/22/2026, 2:55:12 PM
class Solution {
    public int repeatedNTimes(int[] nums) {
     int n = nums.length/2;
     HashMap<Integer, Integer> map = new HashMap<>();
     for(int i = 0; i < nums.length; i++){
        map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
     }for(int i : map.keySet()){
        if(map.get(i) == n) return i;
     }
     return -1;
    }
}