// Last updated: 7/31/2025, 6:05:54 PM
import java.util.ArrayList;  
import java.util.List;  

class Solution {  
    public List<Integer> spiralOrder(int[][] matrix) {  
        List<Integer> result = new ArrayList<>();  
        if (matrix.length == 0) return result;  

        int minc = 0, maxc = matrix[0].length - 1;  
        int minr = 0, maxr = matrix.length - 1;  

        while (minr <= maxr && minc <= maxc) {  
 
            for (int i = minc; i <= maxc; i++) {  
                result.add(matrix[minr][i]);  
            }  
            minr++;  


            for (int i = minr; i <= maxr; i++) {  
                result.add(matrix[i][maxc]);  
            }  
            maxc--;  

            if (minr <= maxr) {  

                for (int i = maxc; i >= minc; i--) {  
                    result.add(matrix[maxr][i]);  
                }  
                maxr--;  
            }  

            if (minc <= maxc) {  

                for (int i = maxr; i >= minr; i--) {  
                    result.add(matrix[i][minc]);  
                }  
                minc++;  
            }  
        }  

        return result;  
    }  
}