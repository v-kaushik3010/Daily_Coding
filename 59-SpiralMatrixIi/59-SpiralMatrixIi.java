// Last updated: 7/31/2025, 6:05:52 PM
import java.util.ArrayList;  
import java.util.List;  
import java.util.*;


class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int [n][n];  
        if (result.length == 0) return result;  

       	int minc= 0, maxc = result[0].length -1, minr=0, maxr = result.length-1;
		int c=0;
		int te = result.length * result[0].length;
		
		while(c <te) {
		for(int i = minc; i <= maxc && c <te; i++ ) {
			result[minr][i]= c+1;
			c++;
		}minr++;
		
		for(int i = minr; i <= maxr && c <te; i++ ) {
			result[i][maxc]= c+1;
			c++;
		}maxc--;
		
		for(int i = maxc; i >= minc && c <te; i-- ) {
			result[maxr][i]= c+1;
			c++;
		}maxr--;
		
		for(int i = maxr; i >= minr && c <te; i-- ) {
			result[i][minc]=c+1;
			c++;
		}minc++;
		}return result;
}
}
        
    
