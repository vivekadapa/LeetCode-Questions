import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1){
           if(nums[0] != 1){
              return 1;
           }    
           else{
               return 0;
           }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[0] != 0){
                return 0;
            }
            if(nums[i] + 1 != nums[i+1]){
                return nums[i] + 1;
            }

        }
        
        
        return nums.length;
    }
}