class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] a=text.split(" ");
        int count=0;
        for(String b:a){
            boolean res=true;
            for(char ch:brokenLetters.toCharArray()){
               if(b.indexOf(ch)!=-1){
                  res=false;
                  break;
               }
            }
            if(res){
                count++;
            }
        }
        
        return count;
    }
}
