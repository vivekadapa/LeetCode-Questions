import java.util.*;

class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int k = nums.length;
        long sum = 0;
        while(k > 0){
            sum = 0;
            for(int i=0;i<k-1;i++){
                sum = sum + nums[i];
            }
            if(sum > nums[k-1]){
                return sum + nums[k-1];
            }
            k--;
        }
        return -1;
    }
}