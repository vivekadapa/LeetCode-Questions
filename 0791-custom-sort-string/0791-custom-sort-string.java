class Solution {
    public String customSortString(String order, String s) {
        int k = 0;
        char[] ordarr = order.toCharArray();
        char[] sarr = s.toCharArray();
        for(int i=0;i<ordarr.length;i++){
            for(int j=0;j<sarr.length;j++){
                if(ordarr[i] == sarr[j]){
                   char temp = sarr[j];
                   sarr[j] = sarr[k];
                   sarr[k] = temp;
                   k++;
                }
            }
        }
        System.out.println(new String(sarr));
        
        return new String(sarr);
    }
}