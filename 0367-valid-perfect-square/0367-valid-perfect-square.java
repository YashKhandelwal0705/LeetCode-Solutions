class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2) return true;
        long l=1;
        long h=num/2;

        while(l<=h){
            long mid=(l+h)/2;
            long square=mid*mid;
            if(num==square){
                return true;
            }
            else if(square>num){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}