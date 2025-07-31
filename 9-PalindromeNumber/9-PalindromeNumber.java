// Last updated: 7/31/2025, 6:06:43 PM
class Solution {
    public boolean isPalindrome(int x) {
        int n=x,rem,rev=0;
        if(x<0){
            return false;
        }
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(x==rev){
            return true;
        }
        else{
            return false;
        }
    }
}