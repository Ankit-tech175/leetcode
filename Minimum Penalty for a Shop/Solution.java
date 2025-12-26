

                 // 2483. Minimum Penalty for a Shop


public class Solution {
    public int bestClosingTime(String customers) {
        int b_t = 0;
        int minPen = 0;
        int pref = 0;
        for (int i = 0; i < customers.length(); i++) {
            char ch = customers.charAt(i);
            pref += ch == 'Y' ? -1 : 1;
            if (pref < minPen) {
                b_t = i + 1;
                minPen = pref;
            }
        }
        return b_t;
    }
}
