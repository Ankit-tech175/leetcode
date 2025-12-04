import java.util.Stack;
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
    private Stack<TreeNode> st= new Stack<>();
    public Solution(TreeNode root) {
        pushAll(root);
    }
    
    public int next() {
        TreeNode tem=st.pop();
        pushAll(tem.right);
        return tem.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
    private void pushAll(TreeNode root){
        for(; root!=null;st.push(root),root=root.left);
    }
}
/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
