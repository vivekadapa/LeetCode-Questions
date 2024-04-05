class Solution {
    public String makeGood(String s) {
        char arr[] = s.toCharArray();
        String str = "";
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<arr.length;i++){
             if(!stk.isEmpty() && 
(stk.peek() == arr[i] + 32 || stk.peek() + 32 == arr[i])){
                stk.pop();
            }
            else{
                stk.add(arr[i]);
            }
        }
        if(stk.isEmpty()){
            return "";
        }
        while(!stk.isEmpty()){
            str = stk.peek() + str;
            stk.pop();
        }
        return str;
    }
}