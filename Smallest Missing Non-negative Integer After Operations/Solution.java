


         // Smallest Missing Non-negative Integer After Operations - 2598 problem no.

public class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n = nums.length, res = 0;
        int[] ar = new int[value];
        for (int x : nums) {
            int r = ((x % value) + value) % value;
            ar[r]++;
        }
        while (ar[res % value]-- > 0) {
            res++;
        }
        return res;
    }
}
