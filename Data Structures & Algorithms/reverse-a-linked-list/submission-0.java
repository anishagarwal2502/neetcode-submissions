/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode first = head;
        head = reverseList(head.next);
        ListNode current = head;
        while(current.next!=null) current = current.next;
        current.next = first;
        first.next = null;
        return head;
        
    }
}
