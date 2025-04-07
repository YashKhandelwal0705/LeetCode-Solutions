class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>>l=new ArrayList<>();
        genss(nums,0,new ArrayList<>(),l);
        return l;
    }

    void genss(int[]nums,int index,List<Integer>curr, List<List<Integer>>l){
        if(index==nums.length){
            l.add(new ArrayList<>(curr));
            return;
        }
    genss(nums,index+1,curr,l);
    curr.add(nums[index]);
    genss(nums,index+1,curr,l);
    curr.remove(curr.size()-1);
    }
}