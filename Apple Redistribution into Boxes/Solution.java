

               // Apple Redistribution into Boxes- 3073 leetcode problem

import java.util.*;
public class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int a:apple){
            sum+=a;
        }
        Arrays.sort(capacity);
        int c=0;
        for(int i=capacity.length-1;i>=0;i--){
            c++;
            if(sum<=capacity[i]){
                return c;
            }
            else{
                sum-=capacity[i];
            }
        }
      return c;
    }
}
