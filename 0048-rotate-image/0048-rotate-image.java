class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        int start=0;
        int end=n-1;
        while(start<end){
            for(int i=0;i<n;i++){
            int temp1=matrix[i][start];
            matrix[i][start]=matrix[i][end];
            matrix[i][end]=temp1;
            }
            start++;
            end--;
        }
    }
}