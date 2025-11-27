


                     // Delete Node in a BST - 450 leetcode problem


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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val==key){
            return help(root);
        }
        TreeNode dumy= root;
        while(root!=null){
            if(root.val>key){
                if(root.left!=null && root.left.val==key){
                    root.left=help(root.left);
                }
                else{
                    root=root.left;
                }
            }
            else{
                if(root.right!=null && root.right.val==key){
                    root.right=help(root.right);
                }
                else{
                    root=root.right;
                }   
            }
        }
        return dumy;
    }
    TreeNode help(TreeNode root){
        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }
        TreeNode rightch =root.right;
        TreeNode lastright= FLR(root.left);
        lastright.right= rightch;
        return root.left;
    }
    TreeNode FLR(TreeNode root){
        if(root.right==null){
            return root;
        }
        return FLR(root.right);
    }
}