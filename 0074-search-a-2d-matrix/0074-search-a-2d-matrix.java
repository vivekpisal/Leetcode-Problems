class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0,col=matrix[0].length-1;
        int n=matrix.length,m=matrix[0].length;
        while(row >= 0 && row < n && col >= 0 &&  col < m){
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] > target) col--;
            else if(matrix[row][col] < target) row++;
        }
        return false;
    }
}