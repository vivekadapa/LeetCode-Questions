class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> arr = new ArrayList<>();
        HashMap<String,List<String>> hmap = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char str[] = strs[i].toCharArray();
            Arrays.sort(str);
            String sortedStr = new String(str);
            if(hmap.containsKey(sortedStr)){
               List<String> temp = hmap.get(sortedStr);
               temp.add(strs[i]);
               hmap.put(sortedStr,temp);
            }
            else{
                List<String> arr1 = new ArrayList<>();
                arr1.add(strs[i]);
                hmap.put(sortedStr,arr1);   
            }
        }
        
        for(String s:hmap.keySet()){
            System.out.println(hmap.get(s));
            arr.add(hmap.get(s));
        }
        
        return arr;
    }
}