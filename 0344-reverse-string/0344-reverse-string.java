class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i=0;2*i<n;i++){
            char temp = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = temp;
        }
    }
}