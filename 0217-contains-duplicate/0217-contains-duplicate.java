import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> hMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hMap.containsKey(nums[i])){
                return true;
            }
            else{
                hMap.put(nums[i],1);
            }
        }
        return false;
    }
}