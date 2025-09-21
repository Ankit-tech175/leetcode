

             // Zigzag Conversion - LeetCode 6 


public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder[] r = new StringBuilder[Math.min(numRows, s.length())];
        for (int i = 0; i < r.length; i++) {
            r[i] = new StringBuilder();
        }
        int cr = 0;
        boolean goingDown = false;
        for (char c : s.toCharArray()) {
            r[cr].append(c);
            if (cr == 0 || cr == numRows - 1) {
                goingDown = !goingDown;
            }
            cr += goingDown ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder ro : r) {
            result.append(ro);
        }
        return result.toString();
    }
}
