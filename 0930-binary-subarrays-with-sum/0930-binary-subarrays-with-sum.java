class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
         int ans = 0;
         int sum = 0;
         for(int i=0;i<nums.length;i++){
             sum = nums[i];
             if(sum == goal){
                 ans++;
             }
             for(int j=i+1;j<nums.length;j++){
                 sum = sum + nums[j];
                 if(sum == goal){
                    ans++;
                 }
             }
         }
        
        return ans;
    }
}