class Solution {
    public int pivotIndex(int[] nums) {
        int sums[] = new int[nums.length];
        int totalSum = 0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
               sums[i] = nums[i];  
            }
            else{
              sums[i] = sums[i-1] + nums[i];        
            }
            totalSum = totalSum + nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            int leftSum = sums[i] - nums[i];
            int rightSum = totalSum - sums[i];
            if(leftSum == rightSum){
                return i;
            }
        }
        
        return -1;
    }
}