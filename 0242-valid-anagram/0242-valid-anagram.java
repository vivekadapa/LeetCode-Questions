class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        String str1 = Arrays.toString(sArr);
        String str2 = Arrays.toString(tArr);
        
        if(str1.equals(str2)){
            return true;
        }
        
        return false;
        
        
    }
}