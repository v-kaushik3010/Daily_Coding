// Last updated: 9/22/2026, 2:44:31 PM
class Solution {
    public int minimumLength(String s) {
        int count = 0;
        int frq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frq[s.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (frq[i] <= 2) {
                count += frq[i];
            } else {
                frq[i] -= 2;
                if (frq[i] % 2 == 0) {
                    count += 2;
                } else {
                    count += 1;
                }
            }
        }
        return count;
    }
}