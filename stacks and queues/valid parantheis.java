class Solution {
    public static boolean checkRedundancy(String s) {
    Stack<Character>st=new Stack<>();
    for(int i=0;i<s.length();i++){
      if( s.charAt(i) == ')' ){
          if(st.peek()==('(')){
             return true;  
          }
          else{
              while( st.peek() != '(' ){
                  st.pop(); 
                 }
                st.pop();
                }
         }
        else{
              st.push(s.charAt(i));
            }       
    }   
       return false; 
    }
}
