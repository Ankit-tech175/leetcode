

        // Binary Watch- 401 leetcode problem

import java.util.*;
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> l = new ArrayList<>();
        for (int h=0; h<12; h++){
            for (int m=0; m<60; m++){
                if (Integer.bitCount(h * 64 + m) == turnedOn){
                   l.add(String.format("%d:%02d", h, m));
                }
            }
        }        
    return l; 
    }
}