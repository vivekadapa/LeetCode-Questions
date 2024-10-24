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

    public List<Integer> getArrayCopy(int[] arr){
        List<Integer> li = new ArrayList<Integer>();
        for(int i:arr){
            li.add(i);
        }
        return li;
    }

    public int[] shuffle() {
        List<Integer> list = getArrayCopy(arr);
        int n = arr.length;
        for(int i=0;i<n;i++){
            int j = random.nextInt(list.size());
            arr[i] = list.get(j);
            list.remove(j);
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