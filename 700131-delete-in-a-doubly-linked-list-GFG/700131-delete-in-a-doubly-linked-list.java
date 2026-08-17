/* Structure of a Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
        if(x==1){
            head=head.next;
            head.prev=null;
            return head;
        }
        x=x-2;
        Node t=head;
        while(x!=0){
            t=t.next;
            x--;
        }
        
        t.next=t.next.next;
        if(t.next==null){
            return head;
        }
        t.next.prev=t;
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna