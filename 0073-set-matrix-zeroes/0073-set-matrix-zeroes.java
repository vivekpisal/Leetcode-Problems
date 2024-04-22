class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int horArr[]=new int[n];
        int verArr[]=new int[m];
        Arrays.fill(horArr,0);
        Arrays.fill(verArr,0);
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    horArr[j]=1;
                    verArr[i]=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(horArr[j] == 1 || verArr[i] == 1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}