// Last updated: 7/31/2025, 6:06:58 PM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyhead = new ListNode(0);
        ListNode tail = dummyhead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0){
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newnode = new ListNode(digit);
            tail.next= newnode;
            tail = tail.next;

            l1 = (l1 != null)? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;

        } 

        ListNode result = dummyhead.next;
        dummyhead.next = null;
        return result;
        
    }
}