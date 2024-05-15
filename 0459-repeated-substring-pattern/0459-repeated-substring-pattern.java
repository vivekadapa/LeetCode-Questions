class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int j = 1;
        while(j<s.length()){
            String str = s.substring(0,j);
            if(s.length() % str.length() == 0){
                int n = s.length() / str.length();
                String newstr = "";
                while(n > 0){
                    newstr = newstr + str;
                    n--;
                }
                if(newstr.equals(s)){
                    return true;
                }
            }
            j++;
        } 
        return false;
    }
}