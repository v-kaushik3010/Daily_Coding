// Last updated: 9/29/2025, 1:39:11 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));

        int prev = points[0][1];
        int arrow = 1;
        for(int i =1; i<points.length; i++){
            if(points[i][0]<=prev) continue;
            else{
                arrow++;
                prev= points[i][1];
            }
        }return arrow;
    }
}