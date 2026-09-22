// Last updated: 9/22/2026, 2:54:39 PM
class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0) return -1;
        int remainder=1;
        int count =1;
        while(remainder %k !=0){
            remainder = ((remainder*10)+1)%k;
            count++;
        }return count;
    }
}