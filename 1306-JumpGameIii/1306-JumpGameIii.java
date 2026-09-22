// Last updated: 9/22/2026, 2:53:09 PM
//DFS recursion

class Solution {
    public boolean canReach(int[] arr, int start) {
       if(start <0 || start >= arr.length || arr[start] <0) return false;
       
        if(arr[start] == 0) return true;

        arr[start] *= -1;
        boolean a = canReach(arr, start+arr[start]);
        boolean b = canReach(arr, start-arr[start]);

        return a||b;
    }
}