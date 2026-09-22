// Last updated: 9/22/2026, 2:42:04 PM
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