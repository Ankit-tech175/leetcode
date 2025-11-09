

                // Balanced Binary Tree -110 problem


public class Solution {
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
 
    public boolean isBalanced(TreeNode root) {
        return balanced(root)!=-1;
    }
    private int balanced(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=balanced(root.left);
        int rh=balanced(root.right);
        if(lh==-1 || rh==-1){
            return -1;
        }
        if(Math.abs(lh-rh)>1){
            return -1;
        }
        return 1+ Math.max(lh,rh);
    }
}
