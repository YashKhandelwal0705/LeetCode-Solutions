class Solution {

    public static boolean isPossible(int[]position, int m, int mid){
        int l=1;
        int count=1;
        int lastPos=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-lastPos>=mid){
                lastPos=position[i];
                count++;
            }
        }
    return count>=m;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=1;
        int h=position[position.length-1]-position[0];
        int res=0;
        while(l<=h){
            int mid=(l+h)/2;
            if(isPossible(position, m,mid)){
                res=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return res;
    }
}