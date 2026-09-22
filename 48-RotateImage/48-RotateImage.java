// Last updated: 9/22/2026, 3:01:58 PM
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = n;

        //reverse top with bottom
        int top = 0;
        int bottom = n-1;
        while(top < bottom){
            for(int col = 0; col < m; col++ ){
                int temp = matrix[top][col];
                matrix[top][col] = matrix[bottom][col];
                matrix[bottom][col] = temp;
            }top++;
            bottom--;
        } 
        
        //transpose
        for(int row =0; row< n; row++){
            for(int col = row+1; col < m; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
    }


}