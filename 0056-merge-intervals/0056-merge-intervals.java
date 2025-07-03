class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;

        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));

        List<int[]> ls= new ArrayList<>();
        int[] current=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] next=intervals[i];

            if(current[1]>=next[0]){
                current[1]=Math.max(next[1],current[1]);
            }
            else{
                ls.add(current);
                current=next;
            }
        }
        ls.add(current);
        return ls.toArray(new int[ls.size()][]);
    }
}