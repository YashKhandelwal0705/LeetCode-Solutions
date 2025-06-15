class Solution {
    public String capitalizeTitle(String title) {
        String[]str= title.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].length()>=3){
                str[i]=Character.toUpperCase(str[i].charAt(0))+ str[i].substring(1).toLowerCase();
            }
            else if(str[i].length()<3){
                str[i]=str[i].toLowerCase();
            }
        }
        return String.join(" ",str);
    }
}