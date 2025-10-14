class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map= new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        ArrayList<Character>l = new ArrayList<>(map.keySet());
        Collections.sort(l, (a,b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder();
        for(char c: l){
            for(int i=0;i<map.get(c);i++){
                sb.append(c);
            }
        }
    return sb.toString();
    }
}