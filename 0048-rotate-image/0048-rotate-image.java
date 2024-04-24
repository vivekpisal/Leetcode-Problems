class Solution {
    private void swap(int[][] matrix,int i,int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    
    private void swap(int[][] matrix,int row,int i,int j){
        int temp = matrix[row][j];
        matrix[row][j] = matrix[row][i];
        matrix[row][i] = temp;
    }
    
    public void reverse(int[][] matrix,int i){
        int lo=0,hi=matrix[i].length-1;
        while(lo <= hi){
            swap(matrix,i,lo,hi);
            hi--;
            lo++;
        }
    }
    
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length;j++){
                if(i != j){
                    swap(matrix,i,j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            reverse(matrix,i);
        }
    }
}