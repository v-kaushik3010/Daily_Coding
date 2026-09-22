// Last updated: 9/22/2026, 2:59:25 PM
class Solution {
    public int numIslands(char[][] grid) {
        int count =0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    Check(grid, i, j);
                }
            }
        }return count;
    } public static void Check(char [][] grid, int i, int j){
        if(i <0|| j<0 || i >=grid.length ||  j >= grid[0].length || grid[i][j] == '0') return;
        
        grid[i][j]= '0';
        Check(grid, i-1, j); //up
        Check(grid, i+1, j); //down
        Check(grid, i, j-1); //left
        Check(grid, i, j+1); //right
    }
}