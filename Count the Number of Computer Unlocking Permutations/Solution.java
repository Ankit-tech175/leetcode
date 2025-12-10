
                   // Count the Number of Computer Unlocking Permutations- 3577 leetcode


public class Solution {
    static final int MOD=1_000_000_007;
    public int countPermutations(int[] complexity) {
        int n=complexity.length;
        int first=complexity[0];
        for(int i=1;i<n;i++){
            if(complexity[i]<=first){
                return 0;
            }
        }
        long f=1;
        for(int i=1;i<n;i++){
            f=(f*i)%MOD;
        }
        return (int) f;
    }
}
