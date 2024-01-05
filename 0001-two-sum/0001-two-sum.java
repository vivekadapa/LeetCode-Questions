import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(target-nums[i])){
                arr[0] = i;
                arr[1] = hashMap.get(target-nums[i]);
            }
            hashMap.put(nums[i],i);
        }        
        return arr;
    }
}