// Last updated: 10/8/2026, 3:32:35 PM
class Solution {
    public String removeOuterParentheses(String s) {
        int l  = 0;
        StringBuilder ans = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(l==0 && ch == '(') l++;

            else if(l == 1 && ch == ')') l--;

            else if( ch == '('){
                ans.append(ch);
                l++;
            }

             else if( ch == ')'){
                ans.append(ch);
                l--;
            }
        }
        return ans.toString();
    }
}