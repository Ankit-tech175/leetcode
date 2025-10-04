


         // container with most water -11 no. Leetcode problem


public class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int c=0;
        while(l<=r){
           int w=Math.min(height[l],height[r])*(r-l);
           c=Math.max(c,w);
           if(height[l]<height[r]){
            l++;
           }
           else{
            r--;
           }
        }
        return c;
    }
}
