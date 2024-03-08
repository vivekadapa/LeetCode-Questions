class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        System.out.println(hmap.toString());
        int max = 0;
        for(int i:hmap.keySet()){
            int val = hmap.get(i);
            if(max < val){
                max = val;
            }
        }
        int count = 0;
        for(int i:hmap.keySet()){
            if(hmap.get(i) == max){
                count++;
            }
        }
        return count*max;
    }
}