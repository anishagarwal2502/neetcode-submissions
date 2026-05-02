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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode result = new ListNode();

        ListNode c1 = list1;
        ListNode c2 = list2;
        ListNode cr = result;

        while(c1!=null && c2!=null){
            if(c1.val<c2.val){
                cr.next = c1;
                c1 = c1.next;
            }else{
                cr.next = c2;
                c2 = c2.next;
            }
            cr = cr.next;
        }

        while(c1!=null){
            cr.next = c1;
            c1 = c1.next;
            cr = cr.next;
        }
        
        while(c2!=null){
            cr.next = c2;
            c2 = c2.next;
            cr = cr.next;
        }

        return result.next;
    }
}