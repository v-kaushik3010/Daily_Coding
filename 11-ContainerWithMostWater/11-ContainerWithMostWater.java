// Last updated: 7/31/2025, 6:06:39 PM
class Solution {
    public int maxArea(int[] height) {
        int maxArea =0;
        int leftwala = 0;
        int rightwala = height.length - 1;

        while (leftwala < rightwala){
            maxArea = Math.max(maxArea,(rightwala - leftwala)*Math.min(height[leftwala],height[rightwala]));

            if (height[leftwala] < height[rightwala]) leftwala++;
            else rightwala--;
        }return maxArea;
        
    }
}