

// LeetCode Problem: Count Hills and Valleys - 2210 problem in leetcode


public class solution {
    public int countHillValley(int[] nums) {
        int c=0;
        int pre=nums[0];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            else if((pre < nums[i] && nums[i] > nums[i + 1]) || (pre > nums[i] && nums[i] < nums[i + 1])){
                c++;
            }
           pre=nums[i];
        }
        return c;
    }
}
