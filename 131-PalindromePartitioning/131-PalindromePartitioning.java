// Last updated: 7/31/2025, 6:05:32 PM
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), s, 0);

        return res;
    }

    private void backtrack(List<List<String>> res, List<String> pathSoFar, String s, int start) {
        if (start == s.length()) {
            res.add(new ArrayList<>(pathSoFar));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            String curr = s.substring(start, i+1);
            if (isPalindrome(curr)) {
                pathSoFar.add(curr);
                backtrack(res, pathSoFar, s, i+1);
                pathSoFar.remove(pathSoFar.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }
}