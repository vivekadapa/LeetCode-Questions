class Solution {
    public int firstUniqChar(String s){
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            freq.put(c,freq.getOrDefault(c,0) + 1);
        }
        for(int i=0;i<s.length();i++){
            if(freq.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}