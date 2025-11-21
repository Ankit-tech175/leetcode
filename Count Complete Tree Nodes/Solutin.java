



            // count complete tree nodes- leetcode 222


public class Solutin {
    
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
 
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lh= lefth(root);
        int rh= righth(root);
        if(lh==rh){
            return (2<<(lh))-1;
        }
        else{
            return 1+ countNodes(root.left) + countNodes(root.right);
        }
    }
    private int lefth(TreeNode root){
        int c=0;
        while(root.left!=null){
            c++;
            root=root.left;
        }
        return c;
    }
    private int righth(TreeNode root){
        int c=0;
        while(root.right!=null){
            c++;
            root=root.right;
        }
        return c;
    }
}
