


                      //   Kth Smallest Element in a BST - 230 leetcode problem

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
 
    int c=0;
    int kt=0;
    public int kthSmallest(TreeNode root, int k) {
        help(root,k);
        return kt;
    }
    private void help(TreeNode root, int k){
        if(root==null){
            return;
        }
        help(root.left,k);
        c++;
        if(c==k){
            kt=root.val;
        }
        help(root.right,k);
    }
}
