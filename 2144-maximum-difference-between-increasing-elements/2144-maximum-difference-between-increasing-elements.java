class Solution {
    public int maximumDifference(int[] nums) {
        int minv=nums[0];
        int res=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>minv){
                res=Math.max(res, nums[i]-minv);
            }
            minv=Math.min(minv, nums[i]);
        }
        return res;
    }
}