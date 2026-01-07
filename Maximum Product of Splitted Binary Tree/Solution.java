
  

           // Maximum Product of Splitted Binary Tree- 1339 leetcode


  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
       TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    long maxP=0, SUM=0;
    public int maxProduct(TreeNode root) {
        if (root == null){
            return 0;
        }
        SUM= totalsum(root);
        totalsum(root);
        return (int)(maxP % 1000000007);
    }
    private int totalsum(TreeNode root){
        if(root==null){
            return 0;
        }
       int lss= totalsum(root.left);
       int rss= totalsum(root.right);
       int subts= root.val+ lss+ rss;
       maxP = Math.max(maxP, subts * (SUM - subts));
       return subts;
        }
}