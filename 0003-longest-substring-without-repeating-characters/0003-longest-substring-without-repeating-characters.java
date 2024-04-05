class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSize = 0;
        int currSize = 0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> set = new HashSet<>();
            currSize = 0;
            for(int j=i;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                   break;
                }
                else{
                    set.add(s.charAt(j));
                    currSize++;
                }
            }
            maxSize = maxSize > currSize ? maxSize : currSize;
        }
        return maxSize;
    }
}