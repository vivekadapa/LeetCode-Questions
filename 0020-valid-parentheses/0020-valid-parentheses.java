class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char arr[] = s.toCharArray();
        
        for(char c : arr){
            if(c == '('){
                stack.push(')');
            }
            else if(c=='['){
                stack.push(']');
            }
            else if(c == '{'){
                stack.push('}');
            }
            else if(stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        
        return stack.isEmpty();
        
    }
}