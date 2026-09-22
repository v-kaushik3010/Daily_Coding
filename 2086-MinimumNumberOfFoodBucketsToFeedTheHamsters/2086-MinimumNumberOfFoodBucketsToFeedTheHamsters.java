// Last updated: 9/22/2026, 2:49:23 PM
class Solution {
    public int minimumBuckets(String hamsters) {
        int n = hamsters.length();
        int count=0;
        int [] arr = new int[n];
        for(int i = 0; i< n ; i++){
            char ch = hamsters.charAt(i);
            if(ch == 'H'){
                if(i>0 &&arr[i-1] == 1) continue;
                else if(i<n-1 && hamsters.charAt(i+1) == '.'){
                    arr[i+1] = 1;
                    count++;
                }else if( i>0 && arr[i-1] ==0 && hamsters.charAt(i-1)=='.'){
                    arr[i-1] =1;
                    count++;
                }else return -1;
            }
        }return count;
    }
}