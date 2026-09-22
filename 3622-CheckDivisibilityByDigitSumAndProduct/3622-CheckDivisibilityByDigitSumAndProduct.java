// Last updated: 9/22/2026, 2:42:43 PM
class Solution {
    public boolean checkDivisibility(int n) {
        long sum = 0;
        long prod =1;
        int num = n;
        while(num >0){
            int a = num%10;
            sum+= a;
            prod *= a;
            num /=10;
        }

        return (n%(sum+prod) == 0);
    }
}