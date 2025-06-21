class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> h1= new HashSet<>();
        HashSet<Character> h2= new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                h1.add(s.charAt(i));
            }
            if(Character.isLowerCase(s.charAt(i))){
                h2.add(s.charAt(i));
            }
        }
        for(char ch='z';ch>='a';ch--){
            if(h2.contains(ch) && h1.contains(Character.toUpperCase(ch))){
                return String.valueOf(Character.toUpperCase(ch));
            }
        }
    return "";
    }
}