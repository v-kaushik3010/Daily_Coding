// Last updated: 3/17/2026, 11:29:37 AM
class Solution {
    public String reversePrefix(String s, int k) {
    StringBuilder str = new StringBuilder();
     char[] arr = s.toCharArray() ;
    for(int i = k-1; i >=0 ; i--){
        str.append(arr[i]);
    }for(int i = k; i < s.length(); i++){
        str.append(arr[i]);
    }return str.toString();
        
    }
}