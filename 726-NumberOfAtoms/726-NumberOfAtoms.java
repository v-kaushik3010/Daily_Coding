// Last updated: 9/22/2026, 2:56:46 PM
import java.util.*;

class Solution {

    int i = 0;   // global index

    public String countOfAtoms(String formula) {
        Map<String, Integer> map = dfs(formula);
        
        // Sort atoms alphabetically
        TreeMap<String, Integer> sorted = new TreeMap<>(map);
        
        StringBuilder sb = new StringBuilder();
        for (String atom : sorted.keySet()) {
            sb.append(atom);
            int count = sorted.get(atom);
            if (count > 1) sb.append(count);
        }
        return sb.toString();
    }

    private Map<String, Integer> dfs(String s) {
        Map<String, Integer> map = new HashMap<>();
        
        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch == '(') {
                i++; // skip '('
                Map<String, Integer> inner = dfs(s);
                int mul = getNumber(s);
                
                for (String key : inner.keySet()) {
                    map.put(key, map.getOrDefault(key, 0) + inner.get(key) * mul);
                }
            }
            else if (ch == ')') {
                i++;   // skip ')'
                return map;
            }
            else {
                String atom = getAtom(s);
                int count = getNumber(s);
                map.put(atom, map.getOrDefault(atom, 0) + count);
            }
        }
        return map;
    }

    private String getAtom(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(i++)); // uppercase
        while (i < s.length() && Character.isLowerCase(s.charAt(i))) {
            sb.append(s.charAt(i++));
        }
        return sb.toString();
    }

    private int getNumber(String s) {
        int num = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i++) - '0');
        }
        return num == 0 ? 1 : num;
    }
}
