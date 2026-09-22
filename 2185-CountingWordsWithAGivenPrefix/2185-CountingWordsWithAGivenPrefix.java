// Last updated: 9/22/2026, 2:48:45 PM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        if(words.length == 0) return 0;
        for (String i: words){
            if (i.startsWith(pref)) count++;
        }return count;
    }
}