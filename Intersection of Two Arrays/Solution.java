


        // Intersection of Two Arrays - LeetCode 349


import java.util.*;
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int x : nums1)
            m.put(x, 1);
        
        for(int x : nums2)
            if(m.getOrDefault(x, 0) == 1)
                m.put(x, 2);
        
        List<Integer> l = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e : m.entrySet())
            if(e.getValue() == 2)
                l.add(e.getKey());
        
        int[] ans = new int[l.size()];
        for(int i = 0; i < l.size(); i++)
            ans[i] = l.get(i);
        return ans;
    }
}
