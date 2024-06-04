class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(char i:s.toCharArray()){
            if(set.contains(i)){
                set.remove(i);
                count++;
            }
            else{
                set.add(i);
            }
        }
        if(!set.isEmpty()) return 2*count + 1;
        else return 2*count;
    }
}