class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;

        int i, j, sum = 0, maxsum = nums[0];

        for(i = 0; i<len-1; i++)
        {   sum = nums[i];
            for(j = i+1; j<len; j++)
            {
                sum += nums[j];

                if(maxsum < sum)
                    maxsum = sum;
            }
        }

        return maxsum;
    }
}