// Last updated: 9/22/2026, 2:47:52 PM
//TC : O(M*N) m = meetings.length
class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        int[] count = new int[n];  //count of meetings for each room
        long[] timer = new long[n]; // time when room i is free

        int itr = 0;

        while (itr < meetings.length) {
            int[] curr = meetings[itr];
            int start = curr[0];
            int end = curr[1];
            long dur = end - start;

            int room = -1;
            long earliest = Long.MAX_VALUE;
            int earliestRoom = -1;
            
            //Iterate though free time of all rooms
            for (int i = 0; i < n; i++) {
                // in case room is not available
                if (timer[i] < earliest) {
                    earliest = timer[i];
                    earliestRoom = i;
                }
                //if room is available
                if (timer[i] <= start) {
                    room = i;
                    break;
                }
            }

            if (room != -1) {  //means room was available 
                timer[room] = end;
                count[room]++;
            } else { // room available nhi tha
                timer[earliestRoom] += dur;
                count[earliestRoom]++;
            }

            itr++; // move to next meeting
        }

        int max = 0, idx = 0;
        for (int i = 0; i < n; i++) {
            if (count[i] > max) {
                max = count[i];
                idx = i;
            }
        }

        return idx;
    }
}