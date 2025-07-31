// Last updated: 7/31/2025, 6:05:11 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int item = target;
		int col = matrix[0].length -1;
		while(row < matrix.length && col >= 0) {
			if(matrix[row][col]==item) {
				return true;
			}
			else if(matrix[row][col] < item) {
				row++;
			}
			else{
				col--;
			}
		}return false;
        
    }
}