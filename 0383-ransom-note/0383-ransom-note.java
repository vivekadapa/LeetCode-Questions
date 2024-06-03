class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char i:ransomNote.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        for(char i:magazine.toCharArray()){
            if(map.containsKey(i)){
                map.put(i,map.get(i) - 1);
            }
        }
        System.out.println(map);
        for(char i: map.keySet()){
            if(map.get(i) > 0){
                return false;
            }
        }
        return true;
    }
}