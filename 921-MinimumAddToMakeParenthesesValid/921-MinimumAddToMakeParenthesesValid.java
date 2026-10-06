// Last updated: 10/6/2026, 2:30:51 PM
class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int ans = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    ans++;
                }
            }
        }

        return ans + open;
    }
}