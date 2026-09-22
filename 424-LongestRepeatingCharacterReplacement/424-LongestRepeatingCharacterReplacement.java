// Last updated: 9/22/2026, 2:58:13 PM
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map = new HashMap<>();
        int left=0;
        int ans = 0;
        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            

            int winSize=right-left+1;
            while(winSize-maxFreq(map)>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
                winSize=right-left+1;
            }

            ans=Math.max(ans,right-left+1);
        }

        return ans;
    }

    public int maxFreq(HashMap<Character,Integer>map){
        int ans=0;
        for(int i : map.values()){
            ans=Math.max(ans,i);
        }
        return ans;
    }
}