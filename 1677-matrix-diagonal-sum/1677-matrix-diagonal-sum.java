class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || (i+j)==(n-1)){
                    list.add(mat[i][j]);
                }
            }
        }
        int sum=0;
        for(int num:list){
            sum+=num;
        }
        return sum;
    }
}