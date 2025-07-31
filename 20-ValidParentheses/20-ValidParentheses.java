// Last updated: 7/31/2025, 6:06:24 PM
class Solution {
    public boolean isValid(String s) {
        int index = 0;
        char[] stack = new char[s.length()];
        if(s.length() % 2 != 0) {
            return false;
        }
        for(char c: s.toCharArray()) {
            if(c == '(') {
                stack[index++] = ')';
            }else if (c == '{') {
                stack[index++] = '}';
            }else if (c == '[') {
                stack[index++] = ']';
            }else {
                index--;
                if(index < 0 || stack[index] != c) {
                    return false;
                }
            }
        }
        return index == 0;
    }
}