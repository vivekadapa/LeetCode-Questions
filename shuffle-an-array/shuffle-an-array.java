class Solution {

    int arr[];
    int original[];
    Random random = new Random();

    public Solution(int[] nums) {
        this.arr = nums;
        this.original = nums.clone();
    }
    
    public int[] reset() {
        return this.original;
    }

    int getRange(int max,int min){
        return random.nextInt(max-min) + min;
    }

    void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public int[] shuffle() {
        int n = arr.length;
        for(int i=0;i<n;i++){
            swap(i,getRange(n,i));
        }
        return arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */