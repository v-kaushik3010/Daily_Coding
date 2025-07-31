// Last updated: 7/31/2025, 6:03:41 PM
class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer>res = new ArrayList<>();
        int[]count = new int[1001];
        for(int[] it:nums){
            for(int i:it){
                count[i]++;
            }
        }
        int n = nums.length;
        for(int i =0;i<count.length;i++){
            if(count[i]==n){
                res.add(i);
            }
        }
        return res;
    }
}