class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        int i = 0;
        while(i<arr.length - 1){
            if(d != arr[i+1] - arr[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}