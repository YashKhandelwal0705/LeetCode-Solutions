class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int l=0,res=0,zero=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
            }
            while(zero>1){
                if(nums[l]==0){
                    zero--;
                }
            l++;
            }
            res=Math.max(res,i-l);
            }
        return res; 
    }
}