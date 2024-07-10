class Solution {
    public int minOperations(String[] logs) {
        int curr = 0;
        
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../")){
                if(curr != 0){
                       curr--;   
                }
            }
            else if(logs[i].equals("./")){
                continue;
            }
            else{
                curr++;
            }
        }
        
        return curr;
    }
}