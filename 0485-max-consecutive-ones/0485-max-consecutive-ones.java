class Solution {
    
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currMax = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                max++;
                currMax = currMax > max ? currMax : max;
            }
            else{
                max = 0;
            }
        }
        
        return currMax;
    }
}