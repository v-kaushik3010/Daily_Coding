// Last updated: 8/13/2025, 10:54:45 AM
class Solution {
    public int maxBalancedShipments(int[] weight) {
        int n = weight.length;
        if (n < 2) {
            return 0;
        }
        
        int count = 0;
        int start = 0;
        int currentMax = weight[0];
        int i = 1; 
        
        while (i < n) {
            if (weight[i] < currentMax) {
                count++;
                

                start = i + 1;
                if (start >= n) {
                    break;
                }
                currentMax = weight[start];
                i = start + 1;
            } else {
                currentMax = Math.max(currentMax, weight[i]);
                i++;
            }
        }
        
        return count;
    }
    
}