class Solution {
    
    public boolean isPalindrome(String s){
        int i =0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;    
    }
    
    public String longestPalindrome(String s) {
        int max = 0;
        if(s.length() == 1){
            return s;
        }
        else if(isPalindrome(s)){
            return s;
        }
        

        String lastmax = s.substring(0,2);
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String str = s.substring(i,j+1);
                if(isPalindrome(str) && str.length() > max){
                    max = str.length();
                    lastmax = str;
                }
            }
        }
        
        return lastmax;
    }
}