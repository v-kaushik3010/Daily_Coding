// Last updated: 9/22/2026, 2:58:08 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));

        int prev= intervals[0][1];
        int out = 0;
        for(int i =1; i< intervals.length; i++){
            if(intervals[i][0] < prev){
                out++;
            }
            else{
                prev= intervals[i][1];
            }
        }return out;
    }
}