class Solution {
    
    public void pickOrNot(int[] nums,List<Integer> arr,int n,int i,List<List<Integer>> ans){
        if(i >= n){
            // System.out.println(arr);
            ans.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[i]);
        pickOrNot(nums,arr,n,i+1,ans);
        arr.remove(arr.size()-1);
        pickOrNot(nums,arr,n,i+1,ans);
    }
    
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        pickOrNot(nums,li,nums.length,0,ans);
        return ans;
    }
}