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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(-1), curr = head;
        PriorityQueue<ListNode> q = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for (ListNode l : lists)
            if (l != null)
                q.add(l);
        while (!q.isEmpty()) {
            curr.next = q.poll();
            curr = curr.next;
            if (curr.next != null)
                q.add(curr.next);
        }

        return head.next;
    }
}
