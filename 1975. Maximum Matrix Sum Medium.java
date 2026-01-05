class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int mini = Integer.MAX_VALUE;
        int count=0;
        int n = matrix.length;
        long sum = 0;
        for(int i =0 ; i < n; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j]>0) {
                    sum+=(long)matrix[i][j];
                    mini= Math.min(mini, matrix[i][j]);
                    }
                else{
                    sum -=(long)matrix[i][j];
                    count++;
                    mini= Math.min(mini, -matrix[i][j]);
                }

            }
        }return count%2==0?sum: (sum -(long)(2*mini));
    }
}
