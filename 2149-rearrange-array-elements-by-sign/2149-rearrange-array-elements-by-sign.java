import java.util.*;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> numsp = new ArrayList<>();
        ArrayList<Integer> numsn = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                numsp.add(nums[i]);
            }
            else{
                numsn.add(nums[i]);
            }
        }
        for(int i=0;i<n/2;i++){
            nums[2*i] = numsp.get(i);
            nums[(2*i)+ 1] = numsn.get(i);
        }
        return nums;
    }
}