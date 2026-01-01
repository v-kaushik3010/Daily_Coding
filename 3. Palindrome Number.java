class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int num =x;
        int nnum =0;
        int last = 0;
        while(x>0){
            last = x%10;
            nnum = nnum*10+last;
            x /=10;
        }return (nnum == num) ? true: false;
    }
}
