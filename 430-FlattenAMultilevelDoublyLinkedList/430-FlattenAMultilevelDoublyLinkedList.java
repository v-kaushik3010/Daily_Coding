// Last updated: 9/22/2026, 2:56:23 PM
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr = head;
        while(curr!= null){
            if(curr.child!=null){
                Node nextnode = curr.next;
                Node childtail = curr.child;
                while(childtail.next!= null){
                    childtail = childtail.next;
                }
                if(nextnode!=null){
                childtail.next = nextnode;
                nextnode.prev= childtail;

                }

                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;

            }curr = curr.next;
        }return head;
    }
}