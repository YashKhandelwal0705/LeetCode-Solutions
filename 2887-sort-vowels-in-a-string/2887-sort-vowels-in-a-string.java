class Solution {
    public String sortVowels(String s) {
        List<Character>vowels= new ArrayList<>();
        Set<Character>vset = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

        for( char ch: s.toCharArray()){
            if(vset.contains(ch)){
                vowels.add(ch);
            }
        }
        Collections.sort(vowels);

        StringBuilder res= new StringBuilder();
        int j=0;
        for(char ch: s.toCharArray()){
            if(vset.contains(ch)){
                res.append(vowels.get(j++));
            }
            else{
                res.append(ch);
            }
        }
        return res.toString();
    }
}