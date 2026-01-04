class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for(int num: nums){
            int currsum =0;
            int count = 0;
            for(int i = 1; i <=num; i++){
                if(num%i == 0){
                    count++;
                    currsum+=i;
                }
                if(count>4) {
                    break;
                }
            }if(count ==4) ans+=currsum;;
        }return ans;
    }
}
//optimized
class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        
        for (int n : nums) {
            int count = 0;
            int currentSum = 0;
            
            // Iterate up to the square root of n
            for (int d = 1; d * d <= n; d++) {
                if (n % d == 0) {
                    // d is a divisor
                    count++;
                    currentSum += d;
                    
                    // If d is not the square root, add its counterpart n/d
                    if (d * d != n) {
                        count++;
                        currentSum += n / d;
                    }
                }
                
                // Optimization: if we already have more than 4, stop
                if (count > 4) break;
            }
            
            // If exactly four divisors were found, add their sum to total
            if (count == 4) {
                totalSum += currentSum;
            }
        }
        
        return totalSum;
    }
}
