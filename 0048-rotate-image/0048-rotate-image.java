class Solution {
    private static void swap(int [][]matrix,int i,int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    
    private static void swap(int [][]matrix,int row,int i,int j){
        int temp = matrix[row][j];
        matrix[row][j] = matrix[row][i];
        matrix[row][i] = temp;
    }
    
    private static void reverse(int [][]matrix,int row){
        int start=0,end = matrix[row].length-1;
        while(start < end){
            swap(matrix,row,start,end);
            start++;
            end--;
        }
    }
    
    public void rotate(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                swap(matrix,i,j);
            }
        }
        for(int i=0;i<matrix.length;i++){
            reverse(matrix,i);
        }
    }
}