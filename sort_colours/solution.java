
               // LeetCode Problem: Sort Colors -75 leetcode problem

package sort_colours;
public class solution {
    public void sortColors(int[] nums) {
     int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low++, mid++);
            } 
            else if (nums[mid] == 1) {
                mid++;
            }
             else {
                swap(nums, mid, high--);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i != j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
  }


