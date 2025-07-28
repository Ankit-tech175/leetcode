
                 // LeetCode Problem: Rotate Array
                 // 189 problem in leetcode

package Array_Rotated;
public class solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
    
         k=k%n;   // effective use if k== 12 or 2 is same rotation pattern
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
        private void reverse(int []nums,int s,int e){
        while(s<e){
            int tem=nums[s];
            nums[s]=nums[e];
            nums[e]=tem;
            s++;
            e--;
        }
        }
    }

