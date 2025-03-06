class Solution {
    public void swap(int [][]matrix,int i,int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public void reverse(int []row){
        int j = row.length-1;
        for(int i=0;i<=j;i++,j--){
            int temp = row[i];
            row[i] = row[j];
            row[j] = temp;
        }
    }

    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                swap(matrix,i,j);
            }
        }
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
    }
}