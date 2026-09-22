// Last updated: 9/22/2026, 2:55:39 PM
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode slow=head,fast=head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}