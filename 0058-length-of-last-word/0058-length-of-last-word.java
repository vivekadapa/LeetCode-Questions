class Solution {
    public int lengthOfLastWord(String s) {
        int size = 0;
        Boolean flag = false;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' ' && flag==false){
                continue;
            }
            else{
                flag = true;
                if(s.charAt(i)==' '){
                    return size;
                }
                size++;
            }
        }
        
        return size;
    }
}