import java.util.*;
public class HasPathSum {
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
       

    public static boolean hasPathSum(TreeNode root,int targetsum){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return targetsum==root.val;
        }
        boolean left=hasPathSum(root.left,targetsum-root.val);
        boolean right=hasPathSum(root.right,targetsum-root.val);

        return left || right;
    }
    public static void main(String[] args){
        
    }
    
}
