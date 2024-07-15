import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.*;
public class HasCycle{
    class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
        val = x;
        next = null;
     }
    }
    public static boolean hasCycle(ListNode head){
        ListNode slow=head;
        ListNode fast =head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args){
        
    }
    
}
