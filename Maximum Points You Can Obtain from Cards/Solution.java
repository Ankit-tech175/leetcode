

        // Maximum Points You Can Obtain from Cards -1423 problem no.

public class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int max=0,a=0,b=0;
        int r=n-1;
        for(int i=0;i<k;i++){
            a+=cardPoints[i];
        }
        max=a;
        for(int j=k-1;j>=0;j--){
            a-=cardPoints[j];
            b+=cardPoints[r--];
            max=Math.max(max,a+b);
        }
        return max;
    }
}
