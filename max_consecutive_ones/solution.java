
                // LeetCode Problem: Max Consecutive Ones - 485 no. problem

public class solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,c=0;
        for(int num :nums){
            if(num==1){
                c++;
               max= Math.max(c,max);
            }
            else{
                c=0;;
            }
        }
        return max;
    }
}
