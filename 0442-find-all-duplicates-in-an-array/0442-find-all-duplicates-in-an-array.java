class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int abs = Math.abs(nums[i])-1;
            if(nums[abs] < 0){
                list.add(Math.abs(abs+1));
            }
            nums[abs] = -1*nums[abs];           
        }
        return list;
    }   
}