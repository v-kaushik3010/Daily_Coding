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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start=list1,mov=list2,end=list1;
        int count=1;
        while(count++<a)
        {
            start=start.next;
        }
        while(mov.next!=null)
        {
            mov=mov.next;
        }
        count=0;
        while(count++<=b)
        {
            end=end.next;
        }
        start.next=list2;mov.next=end;
        return list1;
    }
}

//or

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
    
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode st = list1;
        ListNode end = list1;
        b = b+2;
        int n = 1;
        while(n <= b && st.next != null){
            if(n<a) st= st.next;
            if(n<b) end = end.next;
            n++;
        }
        st.next = list2;
        while(list2.next!=null){
            list2 = list2.next;
        }

        list2.next = end;

        return list1;
    }
}
