class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        int flag = nums[n-1] > nums[0] ? 1 : 0;
        if(flag == 1){
            for(int i=0;i<n-1;i++){
                if(nums[i] > nums[i+1]){
                    return false;
                }
            }
            return true;
        }
        if(flag == 0){
            for(int i=0;i<n-1;i++){
                if(nums[i] < nums[i+1]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}