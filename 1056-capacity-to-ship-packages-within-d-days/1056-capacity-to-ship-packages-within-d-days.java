class Solution {

    private boolean isPossible(int []weights, int mid, int days){
        int curr=0;
        int daycount=1;

        for(int w:weights){
            curr+=w;
            if(curr>mid){
                curr=w;
                daycount++;
            }
        }
        return daycount<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int h=0;
        for(int w: weights){
            l=Math.max(l,w);
            h+=w;
        }
        while(l<h){
            int mid=(l+h)/2;
            if(isPossible(weights,mid,days)){
                h=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}