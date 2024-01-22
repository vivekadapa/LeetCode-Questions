class Solution {
    public String reverseWords(String s) {
       Stack<String> stk = new Stack<>();
       s = s + " ";
       String str = "";
        for(int i=0;i<s.length();i++){
           if(s.charAt(i) == ' '){
              if(!str.isEmpty()){
                   stk.push(str);
               }
               str = "";
           }
           else{
            str = str + s.charAt(i);
           }
       }
       String ans = "";
       while(stk.size() != 1){
           ans = ans + stk.peek() + " ";
           stk.pop();
       }
       ans = ans + stk.peek();
        
       return ans;  
    }
}