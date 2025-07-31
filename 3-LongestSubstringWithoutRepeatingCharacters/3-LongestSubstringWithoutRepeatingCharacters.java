// Last updated: 7/31/2025, 6:06:56 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
         int[] lastIndex = new int[128];
        for (int i = 0; i < 128; i++) {
            lastIndex[i] = -1;
        }

        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (lastIndex[currentChar] >= left) {
                left = lastIndex[currentChar] + 1;
            }

            lastIndex[currentChar] = right;

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    
    }
}