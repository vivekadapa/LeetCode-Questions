class Solution {
    public boolean wordPattern(String pattern, String s) {
         String arr[] = s.split(" ");
         if(arr.length != pattern.length()){
             return false;
         }
         HashMap<Character,String> charToStr = new HashMap<>();
         HashMap<String,Character> strToChar = new HashMap<>();
         for(int i=0;i<pattern.length();i++){
             if(!charToStr.containsKey(pattern.charAt(i))){
                 charToStr.put(pattern.charAt(i),arr[i]);
             }
             if(!strToChar.containsKey(arr[i])){
                 strToChar.put(arr[i],pattern.charAt(i));
             }
             if(strToChar.get(arr[i]) != pattern.charAt(i) ||                                                !charToStr.get(pattern.charAt(i)).equals(arr[i])){
                    return false;                
             }
         }
        return true;
    }
}