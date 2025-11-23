

            // Serialize and Deserialize Binary Tree - Leetcode 297

import java.util.*;
public class Solution {
    
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
    public String serialize(TreeNode root) {
        if(root==null){
            return "";
        }
        Queue<TreeNode> q= new LinkedList<>();
        StringBuilder res= new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node= q.poll();
            if(node==null){
                res.append("# ");
                continue;
            }
            res.append(node.val+ " ");
            q.add(node.left);
            q.add(node.right);
        }
        return res.toString();
    }

    public TreeNode deserialize(String data) {
        if(data==""){
            return null;
        }
        Queue<TreeNode> q= new LinkedList<>();
        String[] value=data.split(" ");
        TreeNode root =new TreeNode(Integer.parseInt(value[0]));
        q.add(root);
        for(int i=1;i<value.length;i++){
            TreeNode parent= q.poll();
            if(!value[i].equals("#")){
                TreeNode left= new TreeNode(Integer.parseInt(value[i]));
                parent.left=left;
                q.add(left);
            }
            if(!value[++i].equals("#")){
                TreeNode right= new TreeNode(Integer.parseInt(value[i]));
                parent.right=right;
                q.add(right);
            }
        }
        return root;
    }
}
