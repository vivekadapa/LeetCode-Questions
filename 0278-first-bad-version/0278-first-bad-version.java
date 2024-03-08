/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
         int left = 1;
         int right = n;
         int mid = 0;
         int ans = 0;
         boolean ver = false;
        while(left <= right){
            mid = left + (right - left)/2;
            ver = isBadVersion(mid);
            if(ver == true){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
}