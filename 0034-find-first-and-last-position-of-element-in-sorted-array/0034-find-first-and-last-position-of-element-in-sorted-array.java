class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []arr=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                arr[0]=mid;
                h=mid-1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }

       int l1=0;
        int h1=nums.length-1;
        while(l1<=h1){
            int mid=(l1+h1)/2;
            if(nums[mid]==target){
                arr[1]=mid;
                l1=mid+1;
            }
            else if(nums[mid]<target){
                l1=mid+1;
            }
            else{
                h1=mid-1;
            }
        }
    return arr;
    }
}