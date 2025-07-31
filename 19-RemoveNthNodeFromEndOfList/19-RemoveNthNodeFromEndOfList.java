// Last updated: 7/31/2025, 6:06:26 PM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode dumb = new ListNode(0,head);
         ListNode dummy = dumb;
         for (int i = 0; i <n; i++){
            head = head.next;
         }
         while(head != null){
            head = head.next;
            dummy = dummy.next;
        }
            dummy.next = dummy.next.next;
            return dumb.next;
    }
}