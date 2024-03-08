class Solution {
    
    public static int BinarySearch(int[] nums,int target,boolean findStartIndex){
         int start = 0;
         int end = nums.length - 1;
         int mid = 0;
         int ans = -1;
         while(start <= end){
             mid = start + (end-start)/2;
             if(nums[mid] < target){
                 start = mid + 1;
             }
             else if(nums[mid] > target){
                 end = mid - 1;
             }
             else{
                 ans = mid;
                 if(findStartIndex){
                     end = mid - 1;
                 }
                 else{
                     start = mid + 1;
                 }
             }
         }
        System.out.println(ans);
        return ans;
    }   
    
    public int[] searchRange(int[] nums, int target) {
         int[] ans = {-1,-1};
         int start = BinarySearch(nums,target,true);
         int end = BinarySearch(nums,target,false);
         ans[0] = start;
         ans[1] = end;
        
         return ans;
    }
}