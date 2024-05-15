class Solution {
    public char findTheDifference(String s, String t) {
        int sSum = 0;
        int tSum = 0;
        for(int i=0;i<t.length();i++){
            if(i<s.length()){
                sSum = sSum +  s.charAt(i);
            }
            tSum = tSum + t.charAt(i);
        }
        
        char c = (char)(tSum - sSum);
        return c;
    }
}