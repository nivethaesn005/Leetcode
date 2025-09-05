class Solution{
  public static removeOuterParentheses(String s){
    StringBuilder str=new StringBuilder();
    int depth=0;
    for(char c:s.toCharArray()){
      if(c=='('){
        if(depth>0){
          str.append(c);
        }
        depth++;
      }
      else{
        depth--;
        if(depth>0){
          str.append(c);
        }
      }
    }
    return str.toString();
  }
}
