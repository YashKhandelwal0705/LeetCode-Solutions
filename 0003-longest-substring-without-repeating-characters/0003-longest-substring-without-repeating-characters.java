class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>st = new HashSet<>();
        int l=0;
        int r=0;
        int max=0;

        while(r<s.length()){
            char ch=s.charAt(r);
            if(!st.contains(ch)){
                st.add(ch);
                max=Math.max(max,r-l+1);
                r++;
            }
            else{
                st.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}