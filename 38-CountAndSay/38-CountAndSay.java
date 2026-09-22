// Last updated: 9/22/2026, 3:02:19 PM
class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        return dp("11", n-1);


    }

    public static String dp(String s, int n){
        if(n ==1 ){
            return s;
        }

        StringBuilder ans = new StringBuilder();
        char prev = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            char ch = s.charAt(i);
            if(prev == (ch)) count++;
            else{
                
                ans.append(count);
                ans.append(prev);

                prev = ch;
                count = 1;
            }
        }
            ans.append(count);
            ans.append(prev);

        return dp(ans.toString(), n-1);
    }
}