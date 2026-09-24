// Last updated: 9/24/2026, 8:43:01 PM
class Solution {
        public int helper(int i , int[] arr, int target){
        if(i== arr.length){
            if(target ==0) return 1;
            else return 0;
        }
        
        int add = helper(i+1, arr, target - arr[i]);
        int sub = helper(i+1, arr, target + arr[i]);
        
        return add+sub;
        
    }
    
    public int findTargetSumWays(int[] arr, int target) {
        int sum = 0;
        for(int n : arr){
            sum += Math.abs(n);
        }

        if(sum < target || (sum + target)%2 != 0) return 0;

        
         return helper(0, arr, target);
    }
}