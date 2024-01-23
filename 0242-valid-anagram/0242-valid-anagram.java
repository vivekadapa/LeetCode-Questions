class Solution {
    public boolean isAnagram(String s, String t) {
            int sArr[] = new int[128];
            int tArr[] = new int[128];
            if(s.length() != t.length()){
                return false;
            }
            for(int i=0;i<s.length();i++){
                sArr[s.charAt(i)]++;
                tArr[t.charAt(i)]++;
            }
            
            for(int i=0;i<s.length();i++){
                if(sArr[s.charAt(i)] != tArr[s.charAt(i)]){
                    return false;
                }
            }
        return true;
    }
}