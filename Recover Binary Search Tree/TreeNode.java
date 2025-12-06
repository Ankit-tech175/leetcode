

           // Recover Binary Search Tree - LeetCode 99


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
    private TreeNode first;
    private TreeNode middle;
    private TreeNode pre;
    private TreeNode last;
    public void recoverTree(TreeNode root) {
        first=middle=last=null;
        pre=new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        if(first!=null && last!=null){
            int t=first.val;
            first.val=last.val;
            last.val=t;
        }
        else if(first!=null && middle!=null){
            int a=first.val;
            first.val=middle.val;
            middle.val=a;
        }
    }
    private void inorder(TreeNode root){
      if(root==null){
            return;
        }
        inorder(root.left);
        if(pre!=null && (root.val<pre.val)){
            if(first==null){
                first=pre;
                middle=root;
            }
            else{
                last=root;
            }
        }
            pre=root;
            inorder(root.right);
    }
}