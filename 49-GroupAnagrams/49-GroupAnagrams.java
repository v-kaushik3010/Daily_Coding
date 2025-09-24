// Last updated: 9/24/2025, 10:33:55 AM
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String key = GetKey(arr[i]);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(arr[i]);
        }
        List<List<String>> ll = new ArrayList<>();
        for (String key : map.keySet()) {
            ll.add(map.get(key));
        }
        return ll;
    }

    public static String GetKey(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int count : freq) {
            sb.append('#'); 
            sb.append(count);
        }
        return sb.toString();
    }
}