class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
     List<String> ll = new ArrayList<>();
     int j = 0;
     ll.add(words[0]);
     for(int i = 1; i < groups.length; i++){
        if(groups[j]!= groups[i]){
            ll.add(words[i]);
            j = i;
        }
     }return ll;
        
    }
}
