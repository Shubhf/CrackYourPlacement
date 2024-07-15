import java.util.*;
public class DeleteNnode {
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public static ListNode  DeleteNnodeFromLast(ListNode head,int n){
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;//Remove first operation
            return head;
        }
        int i=1;
        int iToFind=size-n;
        ListNode prev=head;
        while(i < iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return  prev.next;




    }
    
}
