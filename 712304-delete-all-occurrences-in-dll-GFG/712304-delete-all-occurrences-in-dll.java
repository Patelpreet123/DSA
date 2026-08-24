/* Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // code here
        while(head!=null&&head.data==x){
            head=head.next;
        }
        head.prev=null;
        Node t=head;
        while(t.next!=null){
            if(t.next.data==x){
                t.next=t.next.next;
                if(t.next==null){
                    return head;
                }
                t.next.prev=t;
                continue;
            }
            t=t.next;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna