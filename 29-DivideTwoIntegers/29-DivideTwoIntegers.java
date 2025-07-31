// Last updated: 7/31/2025, 6:06:15 PM
class Solution {
    public int divide(int dividend, int divisor) {
        // Special case
        if (divisor == 0) throw new ArithmeticException("Division by zero is undefined");  
        if (dividend == 0) return 0;
        if (divisor == 1) return dividend;
        if (divisor == dividend) return 1;
        // handel overflow
        if (divisor == -1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
        if (divisor == -1 && dividend == Integer.MAX_VALUE) return Integer.MIN_VALUE+1;


        long sign  = 1;
        if ((divisor < 0) ^ (dividend < 0)){
            sign = -1;
        }

        long absdividend= Math.abs((long)dividend);
        long absdivisor = Math.abs((long)divisor);
        long result = 0;

        while(absdividend >= absdivisor){
            absdividend -= absdivisor;
            result++;
        }return (int)(result*sign);
    }
}


