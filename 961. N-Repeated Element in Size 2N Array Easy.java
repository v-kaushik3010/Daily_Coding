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

//or Using Set to find First Repeated element
class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i:nums)
        {
            if(!s.add(i))
              return i;
        }
        return nums[nums.length-1];
    }
}
