// Last updated: 7/31/2025, 6:04:58 PM
class Solution {
    public int countSubstrings(String s) {
        return(countPalindromeSubstrings(s));
    }

    public static int countPalindromeSubstrings(String s) {
        int count = 0;

        for (int axis = 0; axis < s.length(); axis++) {
            count += expandAroundCenter(s, axis, axis);     // Odd-length palindromes
            count += expandAroundCenter(s, axis, axis + 1); // Even-length palindromes
        }

        return count;
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    
    }
}