class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        Arrays.sort(nums);
        int count=1;
        int res=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i])continue;
            if(nums[i+1]==nums[i]+1){
                count++;
            }
            else{ 
                res=Math.max(count,res);
                count=1;
            }
        }
        return Math.max(res,count);
    }
}