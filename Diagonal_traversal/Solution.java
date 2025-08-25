

               // Leetcod eProblem- Diagonal traversal - 498 no. problem


public class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m= mat[0].length;
        int[] a = new int[n*m];
        int ind=0;
       for(int s=0;s<=n+m-2;s++){
         if(s%2==0){
            int i= Math.min(s,n-1);
            int j=s-i;
            while(i>=0 && j<m){
                a[ind++]=mat[i][j];
                i--;
                j++;
            }
        }
       else{
            int j=Math.min(s,m-1);
            int i=s-j;
            while(i<n && j>=0){
              a[ind++]=mat[i][j];
                i++;
                j--;
            }
         }
        }
        return a;
    }
}
