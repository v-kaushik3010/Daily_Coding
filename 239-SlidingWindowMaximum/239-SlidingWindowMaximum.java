// Last updated: 7/31/2025, 6:05:13 PM
import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];
        
        int n = nums.length;
        int[] sol = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            
            // Remove elements from the back of the deque while they are
            // smaller than the current element, to maintain decreasing order
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            
            // Add the current element index to the deque
            deque.offerLast(i);
            
            // Once the first window is reached, add the maximum to sol
            if (i >= k - 1) {
                sol[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        
        return sol;
    }
}