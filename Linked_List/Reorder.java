package Linked_List;

public class Reorder {
    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
         }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null ){
            return;
        }
        //find the middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHead = slow.next;
        //detach two ll
        slow.next = null;
        //reverse
        ListNode cur = secondHead;
        ListNode prev = null;
        while(cur != null){
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        ListNode t1 = head;
        ListNode t2 = prev;
        while(t2!=null){
            ListNode m1 = t1.next;
            ListNode m2 = t2.next;
            t1.next=t2;
            t2.next=m1;
            t1=m1;
            t2=m2;
        }
    }
    
}
