class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i, j, len = nums.length, sum;

        int [] sol = new int[2];

        for (i = 0; i<len; i++)
        {
            for (j = i+1; j<len; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    sol[0] = i;
                    sol[1] = j;

                    return sol;
                }
            }
        }
        return sol;
    }
}