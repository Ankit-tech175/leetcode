


                       // Find All Anagrams in a String- 438 leetcode


import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> res = new ArrayList<>();
        if(p.length() > s.length()){
            return res;
        }
        int[] freqP = new int[26];
        int[] freqS = new int[26];
        for(char c : p.toCharArray()){
            freqP[c - 'a'] ++;
        }
        for(int i = 0; i < s.length(); i ++){
            freqS[s.charAt(i) - 'a'] ++;
            if(i >= p.length()){
                freqS[s.charAt(i - p.length()) - 'a'] --;
            }
            if(Arrays.equals(freqP, freqS)){
                res.add(i - p.length() + 1);
            }
        }
        return res; 
    }
}