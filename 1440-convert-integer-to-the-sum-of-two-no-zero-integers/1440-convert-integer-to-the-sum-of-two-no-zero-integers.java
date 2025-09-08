class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            int j=n-i;
            if(noz(i) && noz(j)){
                return new int[]{i,j};
            }
        }
        return new int[]{};
    }

    boolean noz(int m){
        while(m>0){
            int ld=m%10;
            if(ld==0) return false;
            m=m/10;
        }
        return true;
    }
}