package Linked_List;

public class PalindromeLinkedList {
    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
         }
    public class Solution{
        // public boolean isPalindrome(ListNode head){
        //     ListNode prev = null;
        //     ListNode slow = head;
        //     ListNode fast = head;
        //     ListNode newListHead = null;
        //     while(fast != null && fast.next != null){
        //         prev = slow;
        //         slow = slow.next;
        //         fast = fast.next.next;
        //         if(newListHead == null){
        //             newListHead = new ListNode(prev.val);
        //         }else{
        //             ListNode node = new ListNode(prev.val);
        //             node.next = newListHead;
        //             newListHead = node;
        //         }
        //     }
        //     //if list is odd
        //     if(fast != null){
        //         slow = slow.next;
        //     }
        //     while(slow != null && newListHead != null){
        //         if(slow.val != newListHead.val){
        //             return false;
        //         }
        //         slow = slow.next;
        //         newListHead = newListHead.next;
        //     }
        //     return true;
        // }

        public ListNode findMiddle(ListNode head){
            ListNode slow = head;
            ListNode fast = head;
            while(fast == null && fast.next == null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        public ListNode reverseList(ListNode head){
            ListNode prev = null;
            ListNode curr = head;
            while(curr != null){
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }
            return prev;
        }

        public boolean isPalindrome(ListNode head){
            if(head == null || head.next == null){
                return true;
            }
            ListNode middle = findMiddle(head);
            ListNode tail = reverseList(middle);
            ListNode temp = head;
            while(tail != null){
                if(tail.val != temp.val){
                    return false;
                }
                tail=tail.next;
                temp=temp.next;
            }
            return true;
        }
}
}
