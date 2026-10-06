// Last updated: 10/6/2026, 2:29:27 PM
class Solution {
    public int maxDepth(String s) {
        int cur =0;
        int ans =0;
        for(char ch: s.toCharArray()){
            if(ch =='('){
                cur++;
                ans = Math.max(cur, ans);
            }
            else if(ch == ')') cur--;
        }

        return ans;
    }
}