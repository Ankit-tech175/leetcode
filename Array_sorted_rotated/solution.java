
                          // LeetCode
                    // Problem: Check if Array is Sorted and Rotated

                    
package Array_sorted_rotated;
public class solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                c++;
            }
        }
        return c<=1;
    }
}

