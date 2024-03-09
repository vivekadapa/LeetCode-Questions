class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hset = new HashSet<>();
        for(int i:nums1){
            hset.add(i);
        }
        HashSet<Integer> hset1 = new HashSet<>();
        for(int i:nums2){
            if(hset.contains(i)){
                hset1.add(i);
            }
        }
        System.out.println(hset1);
        int arr[] = new int[hset1.size()];
        int j = 0;
        for(int i:hset1){
            arr[j++] = i; 
        }
        return arr;
    }
}