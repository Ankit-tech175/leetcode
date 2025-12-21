  

                             // 209. Minimum Size Subarray Sum


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int m_l=Integer.MAX_VALUE;
        int l=0;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                if(r-l+1<m_l){
                    m_l=r-l+1;
                }
                sum-=nums[l];
                l++;
            }
        }
        return m_l !=Integer.MAX_VALUE ? m_l:0;
    }
}