class Solution {
    public int countGoodNumbers(long n) {
        int MOD=1_000_000_007;
        long n1=n/2;
        long x=20;
        long res = n%2==0 ? 1:5;
        while(n1>0){
            if(n1%2==1){
            res=(res*x) %MOD;
            }
        x=(x*x)%MOD;
        n1=n1/2;
    }
    return (int)(res);
    }
}