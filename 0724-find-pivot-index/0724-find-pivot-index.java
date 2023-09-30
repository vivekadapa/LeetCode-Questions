class Solution {
    public int pivotIndex(int[] nums) {
        int j = 0;
        int sumLeft = 0;
        int sumRight = 0;
        while(j < nums.length){
            sumLeft = 0;
            sumRight = 0;
            for(int i=0;i<j;i++){
                sumLeft = sumLeft + nums[i];
            }
            for(int i=j+1;i<nums.length;i++){
                sumRight = sumRight + nums[i];
            }
            
            if(sumLeft == sumRight){
                return j;
            }
            j++;
        }
        return -1;
    }
}