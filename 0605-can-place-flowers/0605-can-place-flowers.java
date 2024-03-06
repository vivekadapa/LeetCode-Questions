class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n){
        if(flowerbed.length == 1 && n==1){
            if(flowerbed[0] == 0){
                return true;
            }
            else{
                return false;
            }
        }
        
         for(int i=1;i<flowerbed.length;i++){
               if(n==0){
                 break;  
               }
               else if(i==1){
                   if(flowerbed[i-1] ==0 && flowerbed[i] == 0){
                       n--;
                       flowerbed[i-1] = 1;
                   }
               }
               else if(i==flowerbed.length-1){
                   if(flowerbed[i] == 0 && flowerbed[i-1] == 0){
                       n--;
                   } 
               }  
               else if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i] == 0){
                    flowerbed[i] = 1;
                    n--;
                }
         }
        
        if(n==0){
            return true;
        }
        else{
            return false;
        }
    }
}