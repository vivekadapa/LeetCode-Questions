import java.util.*;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1 || n==4){
            return true;
        }
        int num = (int)(Math.log(n)/Math.log(2));
        for(int i=0;i<=num;i++){
            int p = (int)Math.pow(2,i);
            if(p == n){
                return true;
            }
        }
        return false;
    }
}