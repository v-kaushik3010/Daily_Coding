// Last updated: 9/22/2026, 3:01:30 PM
class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int mid= -1;

        while(low <= high){
        mid = low + (high -low)/2;

        if((long) mid*mid == (long)x){
            return mid;
        }

        else if( (long)mid * mid < (long) x ){
            low = mid +1;
        }
        else{
            high = mid -1;
        }

        }

        return Math.round(high);

    }
}