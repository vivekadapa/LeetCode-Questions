class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        
        if(s.equals(goal)){
            return true;
        }
        
        int n = s.length();
        int i = 1;
        while(n > i){
            String str1 = s.substring(i,n);
            str1 = str1 + s.substring(0,i);
            if(str1.equals(goal)){
                return true;
            }
            i++;
        }
        
        return false;
        
    }
}