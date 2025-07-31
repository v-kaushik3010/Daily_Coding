// Last updated: 7/31/2025, 6:02:19 PM
class Solution {
 
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length, sum = 0, k = 0;  
        int[] differenceArray = new int[n + 1];  // Difference array for efficient range updates

        // Iterate through nums
        for (int index = 0; index < n; index++) {
            while (sum + differenceArray[index] < nums[index]) {  
                k++;  // Increment query usage count

                // If we've used all queries and still can't make nums[index] zero, return -1
                if (k > queries.length) {  
                    return -1;
                }

                // Extract left, right, and value from the next query
                int left = queries[k - 1][0];  
                int right = queries[k - 1][1];  
                int val =  queries[k - 1][2];  

                // Apply range update using the difference array technique
                if (right >= index) {  
                    //This ensures we only apply the update where it's relevant.
                    differenceArray[Math.max(left, index)] += val;  // Add `val` at the max of `left` and `index`

                    //We subtract val at right + 1 to stop the effect after right.
                    differenceArray[right + 1] -= val;  // Subtract `val` at `right + 1` to maintain range effect
                }
            }
            // Update prefix sum at the current index
            sum += differenceArray[index];  
        }
        return k;  // Return the minimum number of queries required
    }
}