class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        HashSet<Integer>l= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                for(int j=0;j<nums.length;j++){
                    if(Math.abs(j-i)<=k){
                        l.add(j);
                    }
                }
            }
        }
        List<Integer> list = new ArrayList<>(l);
        Collections.sort(list);
        return list;
    }
}