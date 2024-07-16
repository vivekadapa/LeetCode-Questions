class Solution {
    public String getSmallestString(String s) {
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            int num1 = Character.getNumericValue(arr[i]);
            int num2 = Character.getNumericValue(arr[i+1]); 
            if(((num1 % 2 == 0 && num2 % 2 == 0) || (num1 % 2 != 0 && num2 % 2 != 0)) && num1 > num2){
                char temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                break;
            }
        }
        
        return new String(arr);
    }
}