class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> h1= new HashSet<>();
        HashSet<Character> h2= new HashSet<>();
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                h1.add(word.charAt(i));
            }
            if(Character.isLowerCase(word.charAt(i))){
                h2.add(word.charAt(i));
            }
        }
        int count=0;
        for(char ch='a';ch<='z';ch++){
            if(h2.contains(ch) && h1.contains(Character.toUpperCase(ch))){
                count++;
            }
        }
        return count;
    }
}