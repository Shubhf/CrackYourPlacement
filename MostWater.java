import java.util.*;

public class MostWater {
  static class Node{
    int data;
    Node right;
    Node left;
    //constructor
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
    public static int maxArea(int[] height){
        int lp=0;
        int rp=height.length-1;
        int maxArea=0;
        while(lp<rp){
          int ht=Math.min(height[lp],height[rp]);
          int wd=lp-rp;
          int currArea=ht*wd;
          maxArea=Math.max(currArea,maxArea);
          if(height[lp]<height[rp]){
            lp++;
          }else if(height[lp]>height[rp]){
            rp--;
          }  
        }
        return maxArea;
    }
    public static boolean isValidBST(Node root,Node min,Node max){
      if(root==null){
          return true;
      }
      if(min!=null && root.data <=min.data){
          return false;
      }
      else if(max != null && root.data >= max.data){
         return false; 
      }
      return isValidBST(root.left, min, root) && isValidBST(root.right,root,max);

  }
    public static void main(String args[]){
      Node root1=new Node(2);
      root1.left=new Node(1);
      root1.right=new Node(4);

        System.out.println(isValidBST(root1,root1.right,null));
    }
    
}
