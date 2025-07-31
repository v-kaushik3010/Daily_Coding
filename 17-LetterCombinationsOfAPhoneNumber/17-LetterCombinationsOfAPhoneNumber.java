// Last updated: 7/31/2025, 6:06:29 PM
class Solution {
    static String[] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();
        
        if (digits.length() > 0) { // Edge case check
            generateCombinations(digits, "", result);
        }
        
        return result;
    }
    
    public static void generateCombinations(String ques, String ans, List<String> result) {
        if (ques.length() == 0) {
            result.add(ans);
            return;
        }
        
        char ch = ques.charAt(0);
        String getString = key[ch - '0'];
        
        for (int i = 0; i < getString.length(); i++) {
            generateCombinations(ques.substring(1), ans + getString.charAt(i), result);
        }
    }
}