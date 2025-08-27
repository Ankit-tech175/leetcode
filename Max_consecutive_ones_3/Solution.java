


                   // Leetcode 1004. Max Consecutive Ones III

package Max_consecutive_ones_3;
public class Solution {
    public int longestOnes(int[] nums, int k) {
       int l=0, c=0,maxl=0;
       for(int r=0;r<nums.length;r++){
        if(nums[r]==0){
            c++;
        }
       while(c>k){
        if(nums[l]==0){
            c--;
        }
        l++;
       }
       maxl=Math.max(maxl,r-l+1);
       }
       return maxl;
    }
}
