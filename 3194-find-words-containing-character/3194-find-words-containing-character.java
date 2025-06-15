class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer>l = new ArrayList<>(); 
        for(int i=0;i<words.length;i++){
            if(words[i].contains(String.valueOf(x))){
                l.add(i);
            }
        }
        return l;
    }
}