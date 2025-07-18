class Solution {

    boolean find(int[]nums, int target){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0;
        int h=m-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(matrix[mid][0]<=target && matrix[mid][n-1]>=target){
                return find(matrix[mid],target);
            }
            else if(matrix[mid][0]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}