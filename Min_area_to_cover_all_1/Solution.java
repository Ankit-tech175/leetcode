

               // LeetCode Problem: Minimum Area to Cover All 1's in a Grid -3195 no. problem

package Min_area_to_cover_all_1;
public class Solution {
    public int minimumArea(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int l =-1,b=-1;
        int mr=n,mc=m;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    mr=Math.min(mr,i);
                    l=Math.max(l,i);
                    b=Math.max(b,j);
                    mc=Math.min(mc,j);
                }
            }
        }
        if(l==-1){
            return 0;
        }
        return (l-mr+1)*(b-mc+1);
    }
}
