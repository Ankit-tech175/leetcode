


            // Find Triangular Sum of an Array- 2221 no. Leetcode problem


class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
       int[] ar=new int[n-1];
       while(n!=1){
       for(int i=0;i<n-1;i++){
        ar[i]=(nums[i]+nums[i+1])%10;
        nums[i]=ar[i];
       }
       n=n-1;
    }
       return nums[0];
    }
}