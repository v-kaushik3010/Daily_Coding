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
    public int getDecimalValue(ListNode head) {
        int c = 0;
        ListNode temp= head;
        while(temp.next != null){
            c++;
            temp = temp.next;

        }
        int num = 0;
        while(head != null){
            num += head.val *(int)Math.pow(2,c--);  
            head = head.next;

        }
        return num;
    }
}
\
