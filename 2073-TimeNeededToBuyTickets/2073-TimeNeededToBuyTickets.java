// Last updated: 9/22/2026, 2:49:20 PM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                time += Math.min(tickets[i], tickets[k]);
            } else {
                time += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return time;
    }
}

