

                 // First Bad Version- LeetCode 278

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
      
      class VersionControl {
          boolean isBadVersion(int version) {
              return true; //dummy implementation
          }
        }

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=0;
        int high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isBadVersion(mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}