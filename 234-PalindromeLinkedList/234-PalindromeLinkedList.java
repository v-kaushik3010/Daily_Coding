// Last updated: 9/22/2026, 2:58:55 PM
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
    public boolean isPalindrome(ListNode head) {
        // find middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }// now slow is at middle element

        //Reverse the 2nd half of listnode;
        ListNode prev = null;
        while(slow!= null){
            ListNode temp = slow.next;   // store the location of next element of linked list
            slow.next = prev;
            prev = slow; //Swap slow.next and prev
            slow = temp; // move to the next element of linked list
        }


        //now Check for palindrome
        ListNode first = head;
        ListNode second = prev;

        while(second!=null){
            if(first.val != second.val) return false;
            first = first.next;
            second = second.next;
        }
        return true;

    }
}