class Solution {
    public boolean judgeCircle(String moves) {
        // HashMap<Character,Integer> map = new Hashmap<>();
        int arr[] = new int[4]; //0=>'U',1=>'D',2=>'L',3='R'
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                arr[0]++;
            }
            else if(moves.charAt(i) == 'D'){
                arr[1]++;
            }
            else if(moves.charAt(i) == 'L'){
                arr[2]++;
            }
            else{
                arr[3]++;
            }
        }
        
        if(arr[0] == arr[1] && arr[2] == arr[3]){
            return true;
        }
        return false;
    }
}