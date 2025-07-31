// Last updated: 7/31/2025, 6:03:44 PM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        if(words.length == 0) return 0;
        for (String i: words){
            if (i.startsWith(pref)) count++;
        }return count;
    }
}