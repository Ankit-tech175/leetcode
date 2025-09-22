   

                         // 3005. Count Elements With Maximum Frequency

import java.util.HashMap;
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> m= new HashMap<>();
        for(int num : nums){
            m.put(num ,m.getOrDefault(num,0)+1);
        }
        int max=0;
        for(int ma :m.values()){
            max=Math.max(max,ma);
        }
        int maxf=0;
        for(int ma : m.values()){
            if(max==ma){
                maxf++;
            }
        }
        return maxf*max;
    }
}