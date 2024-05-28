import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       Arrays.sort(nums);
       HashSet<List<Integer>> set = new HashSet<>();
       for(int i=0;i<nums.length;i++){
          int j = i+1;
          int k = nums.length - 1;
         while(j<k){
           int sum = nums[i] + nums[j] + nums[k];
           ArrayList<Integer> arr = new ArrayList<>();
           arr.add(nums[i]);
           arr.add(nums[j]);
           arr.add(nums[k]);
           if(sum == 0 && !set.contains(arr)){
               set.add(arr);
               ans.add(arr);
               j++;
               k--; 
           }
           else if(sum < 0){
               j++;
           }
           else{
               k--;
           }
       }
        }

        
       return ans;
    }
}