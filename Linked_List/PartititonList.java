package Linked_List;

public class PartititonList {
    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
         }
    public ListNode partition(ListNode head, int x) {
        ListNode smallList = new ListNode(0);
        ListNode biglist = new ListNode(0);
        ListNode small = smallList;
        ListNode big = biglist;
        while(head != null){
            if(head.val<x){
                small.next = head;
                small = small.next;
            }else{
                big.next = head;
                big = big.next;
            }
            head=head.next;
        }
        small.next = biglist.next;
        big.next = null;
        return smallList.next;
        
    }
    
}
