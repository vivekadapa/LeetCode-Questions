class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int TotalSum = n*(n+1)/2;
        int sum = 0;
        for(int i=1;i<n;i++){
            sum = sum + i;
            TotalSum = TotalSum - (i-1);
            if(sum == TotalSum){
                return i;
            }
        }
        return -1;
    }
}