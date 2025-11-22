


                  // construct binary tree from preorder and inorder traversal- leetcode 105

import java.util.HashMap;
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
    int ind=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            m.put(inorder[i], i); 
        }
        return help(preorder, 0, inorder.length - 1, m);
    }

    private TreeNode help(int[] preorder, int start, int end, HashMap<Integer, Integer> m) {
        if (start > end) {
            return null;
        }
        int rootVal = preorder[ind++];
        TreeNode node = new TreeNode(rootVal);
        int inorderIndex = m.get(rootVal);
        node.left = help(preorder, start, inorderIndex - 1, m);
        node.right = help(preorder, inorderIndex + 1, end, m);
        return node; 
    }
}