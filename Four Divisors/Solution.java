

            // Four Divisors -1390 leetcode


public class Solution {
    public int sumFourDivisors(int[] nums) {
        int Sum = 0;
        for (int n : nums) {
            int c = 0, inSum = 0;
            for (int d = 1; d * d <= n; d++) {
                if (n % d == 0) {
                    int other = n / d;
                    if (d == other) {
                        c++;
                        inSum += d;
                    } else {
                        c += 2;
                        inSum += d + other;
                    }
                    if (c > 4)
                        break;
                }
            }
            if (c == 4)
                Sum += inSum;
        }
        return Sum;
    }
}
