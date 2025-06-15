class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[]nums= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        Arrays.sort(nums);

        HashMap<Integer,Integer>map = new HashMap<>();
        int rank=1;

        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,rank++);
            }
        }

        int result[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=map.get(arr[i]);
        }
        return result;
    }
}