class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         int alph[] = new int[26];
         for(char i:ransomNote.toCharArray()){
            alph[i-'a']++;
         }
         for(char i : magazine.toCharArray()){
             alph[i-'a']--;
         }
         for(int i:alph){
             if(i > 0){
                 return false;
             }
         }
        return true;
    }
}