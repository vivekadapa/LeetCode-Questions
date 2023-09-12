class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        boolean flag = true;
        int i=0;
        int n = str.length();
        while(i < n/2){
             if(str.charAt(i) == str.charAt(n-i-1)){
                 flag = true;
                 i++;
             }  
             else{
                 flag = false;
                 break;
             }
         }

         return flag;
    }
}