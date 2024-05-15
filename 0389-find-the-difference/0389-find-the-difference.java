class Solution {
    public char findTheDifference(String s, String t) {
       HashMap<Character,Integer> smap = new HashMap<>();
       HashMap<Character,Integer> tmap = new HashMap<>();
       int i = 0;
       while(i < s.length()){
           smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0) + 1);
           tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0) + 1);
           i++;
       }
       tmap.put(t.charAt(t.length()-1),tmap.getOrDefault(t.charAt(t.length()-1),0) + 1);
        
       for(int j=0;j<t.length();j++){
           if(smap.get(t.charAt(j)) != tmap.get(t.charAt(j))){
               return t.charAt(j);
           }
       }
       return 'a';
    }
}