import java.util.*;

public class MergeList{
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        public static ListNode mergetwoLists(ListNode l1,ListNode l2){
            if(l1!=null && l2!=null){
                if(l1.val<l2.val){
                    l1.next=mergetwoLists(l1.next,l2);
                    return l1;
                }else{
                    l2.next=mergetwoLists(l1,l2.next);
                    return l2;
                }
            }
            if(l1==null){
                return l2;
            }else{
                return l1;
            }

        }
    public static void main(String[] args){

    }
}
