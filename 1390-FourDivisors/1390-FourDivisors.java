// Last updated: 9/22/2026, 2:53:57 PM
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