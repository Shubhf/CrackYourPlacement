import java.util.*;
public class LevelOrder {
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
    public static List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Queue<Node> q=new LinkedList<>();
        if(root==null){
            return result;}
        q.add(root);
        while(!q.isEmpty()){
           int levels=q.size();
           List<Integer> currList=new ArrayList<>();
           for(int i=0;i<levels;i++){
            if(q.peek().left!=null){
                q.add(q.peek().left);
            }else if(q.peek().right!= null){
                q.add(q.peek().right);
            }
            currList.add(q.remove().data);


           }
           result.add(currList);
        }
        return result;
        




    }
    public static void main(String[] args){

    }
    
}
