// Last updated: 9/22/2026, 2:58:02 PM
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
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        while(l1 != null){
            st1.push(l1.val);
            l1 = l1.next;
        }
        
        while(l2 != null){
            st2.push(l2.val);
            l2 = l2.next;
        }
        
        Stack<Integer> st = new Stack<>();
        int carry=0;
        while(!st1.isEmpty() && !st2.isEmpty()){
            int s = st1.pop()+st2.pop() +carry;
            if(s >9) carry=1;
            else carry =0;
            st.push(s%10);
        }
        while(!st1.isEmpty()){ 
            if(carry==1){
                int s = st1.pop() +carry;
                if(s >9) carry=1;
                else carry =0;
                st.push(s%10); 
            }   
            else st.push(st1.pop());
            }
        while(!st2.isEmpty()) {
            if(carry==1){

                int s = st2.pop() +carry;
                if(s >9) carry=1;
                else carry =0;
                st.push(s%10);  
            }  
            else st.push(st2.pop());
            }

        if(carry==1) st.push(1);
        ListNode ll = new ListNode(-1);
        ListNode h = ll;
        while(!st.isEmpty()){
            //ListNode dum = ;
            ll.next = new ListNode(st.pop());
            ll=ll.next;
        }
        return h.next;

    }
}