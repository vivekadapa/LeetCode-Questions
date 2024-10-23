class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3){
            return false;
        }
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i:nums){
            if(i <= firstMin) firstMin = i;
            else if(i <= secondMin) secondMin = i;
            else return true;
        }
        return false;
    }
}