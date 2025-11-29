

                     // Validate Binary Search Tree - LeetCode 98


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
    public boolean isValidBST(TreeNode root) {
        return isvalid( root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean isvalid(TreeNode root, long minv, long maxv){
        if(root==null){
            return true;
        }
        if(root.val>=maxv || root.val<=minv){
            return false;
        }
        return isvalid(root.left,minv,root.val) && isvalid(root.right, root.val, maxv);
    }
}