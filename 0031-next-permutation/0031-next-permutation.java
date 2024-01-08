class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;
        for(int i=n-1;i>0;i--){
            if(nums[i] > nums[i-1]){
                ind = i-1;
                break;
            }
        }
        if(ind != -1){
          for(int i=n-1;i>ind;i--){
            if(nums[i] > nums[ind]){
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }
        }
           
        }
        int s = ind+1;
        int l = n-1;
        while(s<l){
            int temp = nums[s];
            nums[s] = nums[l];
            nums[l] = temp;
            s++;
            l--;
        }
        
        
    }
}