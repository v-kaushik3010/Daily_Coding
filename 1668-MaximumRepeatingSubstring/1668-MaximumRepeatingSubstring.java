// Last updated: 9/22/2026, 2:51:31 PM
class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String temp = word;
      while(sequence.contains(temp)){
        count++;
        temp += word;
      }
      return count;
    }
}