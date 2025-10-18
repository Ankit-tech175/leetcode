


       // contest question - sum of elements with frequency divisible by k
import java.util.HashMap;
public class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int sum = 0;
        for (int num : nums) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (m.get(num) % k == 0) {
                sum += num;
            }
        }
        return sum;
    }
}
