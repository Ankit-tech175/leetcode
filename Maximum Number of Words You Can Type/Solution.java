
                  // 1935. Maximum Number of Words You Can Type

import java.util.HashSet;
import java.util.Set;
public class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] ar = text.split(" ");
        Set<Character> s = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            s.add(c);
        }
        int c = 0;
        for (String st : ar) {
            boolean istyped = true;
            for (char ch : st.toCharArray()) {
                if (s.contains(ch)) {
                    istyped = false;
                    break;
                }
            }
            if (istyped) {
                c++;
            }
        }
        return c;
    }
}
