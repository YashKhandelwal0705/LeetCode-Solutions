class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String>l= new ArrayList<>();
        for(int i=0;i<s.length();i+=k){
            l.add(s.substring(i,Math.min(i+k,s.length())));
        }
        String[]str=l.toArray(new String[0]);
        if(str[str.length-1].length()<k){
            StringBuilder sb = new StringBuilder(str[str.length - 1]);
            while (sb.length() < k) {
            sb.append(fill);
            }
            str[str.length - 1] = sb.toString();
        }
        return str;
    }
}