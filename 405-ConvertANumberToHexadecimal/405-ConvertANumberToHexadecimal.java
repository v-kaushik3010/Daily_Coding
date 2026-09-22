// Last updated: 9/22/2026, 2:58:16 PM
class Solution {
    public String toHex(int num) {
        char [] val = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if(num == 0) return "0";
        String result = "";
        while(num != 0){
            result = val[(num&15)] + result;
            num = (num>>>4);
        }return result;
    }
}