
               // Binary Tree Maximum Path Sum-124 problem


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
    public int maxPathSum(TreeNode root) {
        int [] a=new int[1];
        a[0]=Integer.MIN_VALUE;
        maxp(root,a);
        return a[0];
    }
    private int maxp(TreeNode root, int [] a){
        if(root==null){
            return 0;
        }
        int ls=Math.max(0,maxp(root.left,a));
        int rs=Math.max(0,maxp(root.right,a));
        a[0]=Math.max(a[0],ls+rs+root.val);
        return root.val+ Math.max(ls,rs);
    }
}
