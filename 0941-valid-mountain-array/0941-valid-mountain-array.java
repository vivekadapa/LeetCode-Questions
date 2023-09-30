class Solution {
    public boolean validMountainArray(int[] arr) {
         int n = arr.length;
         if(n < 3){
             return false;
         }
         int climb = 0;
         for(int i=0;i<n;i++){
             if(i+1 < n && arr[i] < arr[i+1]){
                climb++;
             }
         }
        
        if(climb == 0 || climb == n-1){
            return false;
        }
        
        for(int i=climb;i<n;i++){
            if(i+1 < n && arr[i] > arr[i+1]){
                climb++;
            }
        }
        
        if(climb == n-1){
            return true;
        }
         
        return false;
        
    }
}