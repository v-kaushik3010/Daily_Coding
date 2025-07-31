// Last updated: 7/31/2025, 6:05:23 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
          if(headA == null || headB == null) return null;
    
    ListNode pcr = headA;
    ListNode vgf = headB;
    
    while( pcr != vgf){

        pcr = pcr == null? headB : pcr.next;
        vgf = vgf == null? headA : vgf.next;    
    }
    
    return pcr;
    }
}