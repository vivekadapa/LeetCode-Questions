class Solution {
    
    public static String sort01(char[] arr){
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == '1'){
               char temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j++;
            }
         }
        return new String(arr);
    }
    
    public String maximumOddBinaryNumber(String s) {
         char[] arr = s.toCharArray();
         if(arr[arr.length-1] == '1'){
            return sort01(arr);
         } 
         else{
             for(int i=arr.length-2;i>=0;i--){
                 if(arr[i] == '1'){
                     char temp = arr[i];
                     arr[i] = arr[arr.length-1];
                     arr[arr.length-1] = temp;
                     break;
                 }
             }
             return sort01(arr);
         }
    }
}