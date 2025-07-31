// Last updated: 7/31/2025, 6:05:44 PM
class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                int height = arr[stack.pop()];
                int rightBoundary = i;
                int leftBoundary = stack.isEmpty() ? -1 : stack.peek();
                int width = rightBoundary - leftBoundary - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        // Process remaining bars in stack
        while (!stack.isEmpty()) {
            int height = arr[stack.pop()];
            int rightBoundary = n;
            int leftBoundary = stack.isEmpty() ? -1 : stack.peek();
            int width = rightBoundary - leftBoundary - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
        
    
}