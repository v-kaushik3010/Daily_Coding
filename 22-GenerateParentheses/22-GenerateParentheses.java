// Last updated: 7/31/2025, 6:06:20 PM
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        parenthesis(n, 0, 0, "", result);
        return result;
    }

    public static void parenthesis(int n, int closed, int open, String ans, List<String> result) {
        if (open == n && closed == n) {
            result.add(ans); // Add the valid combination to the result list
            return;
        }

        // If open exceeds n or closed exceeds open, it's invalid
        if (open > n || closed > open) return;

        // Add an open parenthesis
        parenthesis(n, closed, open + 1, ans + "(", result);

        // Add a closed parenthesis
        parenthesis(n, closed + 1, open, ans + ")", result);
    }
}
