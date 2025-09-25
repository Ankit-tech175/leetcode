

          // Single Number II -137 leetcode problem

public class Solution {
    public int singleNumber(int[] nums) {
     int ans=0;
     for(int i=0;i<32;i++){
        int sum=0;
        for(final int num:nums){
            sum=sum+(num>>i&1);
        }
        sum%=3;
        ans=ans|(sum<<i);
     }  
     return ans; 
    }
}
