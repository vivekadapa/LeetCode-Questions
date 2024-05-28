class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while(left <= right){
           int minheight = Math.min(height[left],height[right]);
           int area = minheight * (right-left);
           max = Math.max(area,max);
           if(height[left] < height[right]){
               left++;
           }
           else{
                right--;
           }
        }
        return max;
    }
}