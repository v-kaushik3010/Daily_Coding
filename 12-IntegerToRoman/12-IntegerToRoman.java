// Last updated: 7/31/2025, 6:06:38 PM
class Solution {
    public String intToRoman(int n) {
        if (n == 0) return "";

        StringBuilder ans = new StringBuilder();

        while (n > 0) {
            if (n >= 1 && n < 5){
                if (n == 4) {
                    ans.append("IV");
                    n -= 4;
                    continue;
                }
                ans.append("I");
                n -= 1;

            } else if (n >= 5 && n < 10) {
                if (n == 9) {
                    ans.append("IX");
                    n -= 9;
                    continue;
                }
                ans.append("V");
                n -= 5;
                
            } else if (n >= 10 && n < 50) {
                if (n >= 40) {
                    ans.append("XL");
                    n -= 40;
                    continue;
                }
                ans.append("X");
                n -= 10;
                
            } else if (n >= 50 && n < 100) {
                if (n >= 90) {
                    ans.append("XC");
                    n -= 90;
                    continue;
                }
                ans.append("L");
                n -= 50;
                
            } else if (n >= 100 && n < 500) {
                if (n >= 400) {
                    ans.append("CD");
                    n -= 400;
                    continue;
                }
                ans.append("C");
                n -= 100;
                
            } else if (n >= 500 && n < 1000) {
                if (n >= 900) {
                    ans.append("CM");
                    n -= 900;
                    continue;
                }
                ans.append("D");
                n -= 500;
            } else {
                ans.append("M");
                n -= 1000;
            }
        }

        return ans.toString();
    }
}