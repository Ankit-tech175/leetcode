

              // LeetCode Problem: Count the number of subarrays filled with zeros - 2348 no. problem


public class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0;
        long res=0;
        for(int a :nums){
            if(a==0){
                c++;
                res+=c;
            }
            else{
                c=0;
            }
        }
        return res;
    }
}

