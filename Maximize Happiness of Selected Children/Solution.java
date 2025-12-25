


                 // Maximize Happiness of Selected Children- 3075 leetcode problem

import java.util.*;
public class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int c=0;
        long res=0;
        for(int i=happiness.length-1;i>=0&& k>0;i--){
            int curr=happiness[i]-c;
            if(curr>0){
                res+=curr;
            }
            c++;
            k--;
        }
        return res;
    }
}
