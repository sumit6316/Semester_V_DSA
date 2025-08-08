package Linked_List;

public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // public ListNode iterative_reverse(ListNode head){
    //     ListNode prev = null;
    //     ListNode curr = head;
        
    //     while(curr != null){
    //         ListNode next_node=curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=next_node;
    //     }
    //     return prev;
    // }

    public ListNode recursive_reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode last = recursive_reverse(head.next);
        head.next.next = last;
        head.next = null;
        return last;
    }
    
}
