

          // 199. Binary Tree Right Side View


import java.util.*;
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
 
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l= new ArrayList<>();
        rightside(root,l,0);
        return l;
    }
    private void rightside(TreeNode root, List<Integer> l, int depth){
        if(root==null){
            return;
        }
        if(depth==l.size()){
            l.add(root.val);
        }
        rightside(root.right,l,depth+1);
        rightside(root.left,l,depth+1);
    }
}
