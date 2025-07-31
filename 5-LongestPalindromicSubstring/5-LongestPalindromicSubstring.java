// Last updated: 7/31/2025, 6:06:50 PM
class Solution {
    int start;
    int end;

    public String longestPalindrome(String s) {
        start = 0;
        end = 0;
        if(s.length() == 1){
            return s;
        }

        helper(s.toCharArray(), 0);

        return s.substring(start, end+1);
    }

    public void helper(char[] arr, int i){
        int n = arr.length;
        if(i > n - 1){
            return;
        }

        int left = i;
        int right = i;
        while(right <n-1 && arr[right] == arr[right+1]){
            right++;
        }

        i = right;

        while(left>0 && right<n-1 && arr[left-1] == arr[right+1]){
            left--;
            right++;
        }

        if(right-left > end-start){
            start = left;
            end = right;
        }

        helper(arr, i+1);
    }
}