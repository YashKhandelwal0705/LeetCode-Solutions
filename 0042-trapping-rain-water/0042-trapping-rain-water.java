class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int max=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(height[i]>max){
                max=height[i];
                idx=i;
            }
        }
        int water=0;
        int leftmax=-1;
        int rightmax=-1;
        for(int i=0;i<=idx;i++){
            if(leftmax>height[i]){
                water+=leftmax-height[i];
            }
            else{
                leftmax=height[i];
            }
        }
        for(int i=n-1;i>idx;i--){
            if(rightmax>height[i]){
                water+=rightmax-height[i];
            }
            else{
                rightmax=height[i];
            }
        }
        return water;
    }
}