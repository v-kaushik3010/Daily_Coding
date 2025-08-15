// Last updated: 8/15/2025, 9:28:17 PM
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
    public ListNode reverseKGroup(ListNode head, int k) {
         if (head == null) return null;

        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            if (tail == null) return head;
            tail = tail.next;
        }

        ListNode newHead = reverse(head, tail);
        head.next = reverseKGroup(tail, k);
        return newHead;
        
    }
    private ListNode reverse(ListNode cur, ListNode end){
        ListNode prev = null;
        while(cur != end){
            ListNode next = cur.next;
            cur.next = prev;
            prev =  cur;
            cur = next;
        }return prev;
    }
}