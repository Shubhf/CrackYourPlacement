import java.util.*;
public class MergeKSortedList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val,ListNode next){this.val=val;
        this.next=next;}
    }
    public static ListNode mergeKLists(ListNode[] lists){
        if(lists==null || lists.length==0){return null;}
        return divide(lists,0,lists.length-1);
    }
    public ListNode divide(ListNode[] lists,int lo,int hi){
        if(lo==hi) return lists[lo];
        int m=lo+(hi-lo)/2;
        ListNode a=divide(lists,lo,m);
        ListNode b=divide(lists,m+1,hi);
        return merge(a,b);
    }
    public static ListNode merge(ListNode a,ListNode b){
        if(a==null){return b;}
        if(b==null){return a;}
        if(a.val<b.val){
            a.next=merge(a.next,b);
            return a;
        }
        b.next=merge(a,b.next);
        return b;
    }
    
    
}
