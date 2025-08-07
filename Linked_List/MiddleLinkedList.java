package Linked_List;

public class MiddleLinkedList {
    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
         }
    public class Solution{
        public ListNode middleNode(ListNode head){
            ListNode slow = head;
            ListNode fast = head;
            while(fast != null && fast.next != null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
    }
}
