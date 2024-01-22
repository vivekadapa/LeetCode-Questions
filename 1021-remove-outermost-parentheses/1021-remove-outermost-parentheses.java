class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder Str = new StringBuilder();
        int open = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(open > 0){
                    Str.append(ch);
                }
                open++;
            }
            else{
                if(open > 1){
                    Str.append(ch);
                }
                open--;
            }
        }
        return Str.toString();
    }
}