class Solution {
    
    public static int squareSum(int n){
        int sum = 0; 
        while(n != 0){
             int temp = n%10;
             sum = sum + temp*temp;
             n = n/10;
         }
        return sum;
    }
    
    public boolean isHappy(int n) {
        
        int slow,fast;
        slow = fast = n;
        
        do{
            slow = squareSum(slow);
            fast = squareSum(fast);
            fast = squareSum(fast);
            if(fast == 1){
                return true;
            }
        }while(slow != fast);
        
        return false;
    }
}