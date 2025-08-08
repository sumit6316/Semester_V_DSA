package Linked_List;

public class SwapInPairs {

    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
         }

    public ListNode swapPairs(ListNode head) {
        ListNode first = head;
        ListNode prev = null;
        while(first != null && first.next != null){
             ListNode second = first.next;
             
             first.next=second.next;
             second.next = first;
             if(prev==null){
                head = second;
             }else{
                prev.next = second;
             }
             prev = first;
             first = first.next;
        }
        return head;
    }
}
