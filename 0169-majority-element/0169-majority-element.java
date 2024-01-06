import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> hMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hMap.containsKey(nums[i])){
                int temp = hMap.get(nums[i]);
                hMap.put(nums[i],temp+1);
            }
            else{
                hMap.put(nums[i],1);
            }
            if(hMap.get(nums[i]) > nums.length/2){
                return nums[i];
            }
        }
        return 0;
    }
}