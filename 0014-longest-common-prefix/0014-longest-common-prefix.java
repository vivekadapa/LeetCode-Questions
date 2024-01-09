import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int min = Math.min(str1.length(),str2.length());
        int i = 0;
        while(i<min){
            if(str1.charAt(i) == str2.charAt(i)){
              i++;   
            }
          else{
            break;
          }
        }
        
        return str1.substring(0,i);
    }
}