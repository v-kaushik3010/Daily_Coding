// Last updated: 9/22/2026, 2:47:21 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n==1) return 0;
        else if(n%2 ==0) return n/2;
        else return n;
    }
}