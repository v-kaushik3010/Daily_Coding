//Using Set
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

//Using Map
class Solution {
    public int[] findErrorNums(int[] arr) {
        int[] ans = new int[2];
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= n;i++) map.put(i,0);
        for(int i = 0; i < n;i++){
           map.put(arr[i],map.get(arr[i])+1);
        }
        for(int i : map.keySet()){
            if(map.get(i)==0) ans[1] = i;
            if(map.get(i)==2) ans[0] = i;
        }return ans;
    }
}
