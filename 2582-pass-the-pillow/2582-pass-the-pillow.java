class Solution {
    public int passThePillow(int n, int time) {
        int currN = 1;
        boolean flagright = true;
        while(time > 0){
            if(currN < n && flagright){
                currN++;
                time--;
            }
            else{
                currN--;
                time--;
            }
            if(currN >= n){
                flagright = false;
            }
            else if(currN == 1){
                flagright = true;
            }
            
        }
        return currN;
    }
}