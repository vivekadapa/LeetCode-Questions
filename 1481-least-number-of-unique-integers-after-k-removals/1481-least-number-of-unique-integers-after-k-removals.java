class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> hMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            // hMap.getOrDefault(hMap.get(arr[i])+1,1);
            hMap.put(arr[i],hMap.getOrDefault(arr[i],0) + 1);
        }
        ArrayList<Integer> freq = new ArrayList<>(hMap.values());
        Collections.sort(freq);
        int removed = 0;
        for(int i=0;i<freq.size();i++){
            removed = removed + freq.get(i);
            if(removed > k){
                return freq.size()-i;
            }
        }
        
        return 0;
        
    }
}