class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int res=0, fact=1;
        for(int i=0;i<4;i++){
            int d1=num1%10;
            int d2=num2%10;
            int d3=num3%10;
            res=res + fact *Math.min(d1,Math.min(d2,d3));
            fact*=10;

            num1/=10;
            num2/=10;
            num3/=10;
        }
        return res;
    }
}